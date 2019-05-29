package com.kane.springboot002.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈切面类〉
 *
 * @author Kane
 * Date:   2019/5/29 10:41
 * @since 1.0.0
 */
@Aspect
public class MyAspect {
    private Logger logger = LoggerFactory.getLogger(MyAspect.class);

    @Pointcut("execution(* com.kane.springboot002.aop.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut(){

    }
    @Before("pointCut()")
    public void before(){
        logger.info("before...");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        logger.info("around before...");
        jp.proceed();
        logger.info("around after...");

    }
    @After("pointCut()")
    public void after(){
        logger.info("after...");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        logger.info("afterReturning...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        logger.info("afterThrowing...");
    }


}