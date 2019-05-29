package com.kane.springboot002.proxy;

import com.kane.springboot002.interceptor.Interceptor;
import com.kane.springboot002.interceptor.Invocation;
import com.kane.springboot002.interceptor.MyInterceptor;
import com.kane.springboot002.service.HelloService;
import com.kane.springboot002.service.HelloServiceImpl;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *
 * @author Kane
 * Date:   2019/5/28 8:55
 * @since 1.0.0
 */
public class ProxyBean implements InvocationHandler {
    private Object target = null;
    private Interceptor interceptor = null;

    /**
     * 绑定代理对象
     * @param target
     * @param interceptor
     * @return
     */
    public static Object getProxyBean(Object target,Interceptor interceptor){
        ProxyBean proxyBean = new ProxyBean();
        proxyBean.target = target;
        proxyBean.interceptor = interceptor;
        //生成代理对象
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),proxyBean);
        return proxy;
    }

    /**
     *处理代理对象方法逻辑
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        boolean exceptionFlag = false;
        Invocation invocation = new Invocation(args,method,proxy);
        Object retObj = null;
        this.interceptor.before();
        try {
            if(this.interceptor.useAround()){
                retObj = this.interceptor.around(invocation);
            }else {
                retObj = method.invoke(target,args);
            }
        }catch (Exception e){
            exceptionFlag = true;
        }
        this.interceptor.after();
        if (exceptionFlag){
            this.interceptor.afterThrowing();
        }else {
            this.interceptor.afterReturning();
            return retObj;
        }
        return null;
    }

    public static void main(String[] args) {
        Instrumentation instrumentation;
        ClassFileTransformer classFileTransformer;
        HelloService helloService = new HelloServiceImpl();
        HelloService proxy =(HelloService) ProxyBean.getProxyBean(helloService,new MyInterceptor());
        proxy.sayHello(null);
    }
}