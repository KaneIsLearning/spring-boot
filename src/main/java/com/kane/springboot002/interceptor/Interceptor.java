package com.kane.springboot002.interceptor;

import java.lang.reflect.InvocationTargetException;

/**
 * 〈一句话功能简述〉<br>
 * 〈拦截器〉
 *
 * @author dell
 * @create 2019/5/27
 * @since 1.0.0
 */
public interface Interceptor {
    //事前方法
    boolean before() ;
    //事后方法
    void after ();

    Object around(Invocation invocation)
            throws InvocationTargetException,IllegalAccessException;
    //是否返回方法 。 事件没有发生异常执行
    void afterReturning() ;
    //事后异常方法 ， 当事件发生异常后执行
    void afterThrowing ();
    //是否使用 around 方法取代原有方法
    boolean useAround() ;
}
