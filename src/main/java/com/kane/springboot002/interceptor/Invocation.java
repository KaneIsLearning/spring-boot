package com.kane.springboot002.interceptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *
 * @author Kane
 * Date:   2019/5/27 16:21
 * @since 1.0.0
 */
public class Invocation {
    private Object[] params;
    private Method method;
    private Object target;

    public Invocation(Object[] params, Method method, Object target) {
        this.params = params;
        this.method = method;
        this.target = target;
    }
    //反射方法
    public Object proceed() throws InvocationTargetException,IllegalAccessException{
        return method.invoke(target,params);
    }

    /**get and set**/
    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}