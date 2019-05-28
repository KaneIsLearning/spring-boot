package com.kane.springboot002.interceptor;

import java.lang.reflect.InvocationTargetException;

/**
 * 〈一句话功能简述〉<br>
 * 〈自定义拦截器〉
 *
 * @author Kane
 * Date:   2019/5/27 16:26
 * @since 1.0.0
 */
public class MyInterceptor implements Interceptor{

    @Override
    public boolean before() {
        System.out.println("MyInterceptor before()...");
        return true;
    }

    @Override
    public void after() {
        System.out.println("MyInterceptor after()...");
    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("MyInterceptor around()...begin");
        Object object = invocation.proceed();
        System.out.println("MyInterceptor around()...end");
        return object;
    }

    @Override
    public void afterReturning() {
        System.out.println("MyInterceptor afterReturning()...");
    }

    @Override
    public void afterThrowing() {
        System.out.println("MyInterceptor afterThrowing()...");
    }

    @Override
    public boolean useAround() {
        System.out.println("MyInterceptor useAround()...");
        return true;
    }
}