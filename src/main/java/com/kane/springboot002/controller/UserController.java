package com.kane.springboot002.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户模块前台控制器〉
 *
 * @author Kane
 * Date:   2019/5/23 10:32
 * @since 1.0.0
 */
@RestController
@RequestMapping("/")
public  class UserController {

    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;
    private AnnotationConfigApplicationContext annotationConfigApplicationContext;
    private ComponentScan componentScan;
    private SpringBootApplication springBootApplication;

    @RequestMapping("/")
    public String index(){
        return "spring boot 实战";
    }

}