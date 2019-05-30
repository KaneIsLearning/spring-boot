package com.kane.springboot002.aop.service.impl;

import com.kane.springboot002.aop.bean.User;
import com.kane.springboot002.aop.service.UserService;
import com.kane.springboot002.data.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户服务实现类〉
 *
 * @author Kane
 * Date:   2019/5/29 10:32
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public void printUser(User user) {
        if(user == null){
            throw new RuntimeException("检查用户参数是否为空...");
        }
        logger.info("打印输出用户信息："+user);
    }

    @Override
    public User findUser(int id) {
        return userMapper.findUserById(id);
    }

}