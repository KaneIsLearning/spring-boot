package com.kane.springboot002.service;

/**
 * 〈一句话功能简述〉<br>
 * 〈shixian〉
 *
 * @author Kane
 * Date:   2019/5/27 16:09
 * @since 1.0.0
 */
public class HelloServiceImpl implements HelloService{

    @Override
    public void sayHello(String name) {
        if(name == null || name.trim().equals("")){
            throw new RuntimeException("sayHello(方法传参为空或空字符串)");
        }
        System.out.println("Hello!"+name+".");
    }
}