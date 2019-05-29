package com.kane.springboot002.aop.controller;

import com.kane.springboot002.aop.bean.User;
import com.kane.springboot002.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户服务前端控制器〉
 *
 * @author Kane
 * Date:   2019/5/29 13:53
 * @since 1.0.0
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return "spring boot 实战";
    }

    @RequestMapping("/print")
    @ResponseBody
    public User printUser(int id,String name,String description){
        User user = new User(id,name,description);
        userService.printUser(user);
        return user;
    }

}