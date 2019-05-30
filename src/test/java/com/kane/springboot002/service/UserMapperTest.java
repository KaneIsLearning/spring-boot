package com.kane.springboot002.service;

import com.kane.springboot002.aop.bean.User;
import com.kane.springboot002.data.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 〈一句话功能简述〉<br>
 * 〈s〉
 *
 * @author Kane
 * Date:   2019/5/30 15:04
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    private Logger logger = LoggerFactory.getLogger(UserMapperTest.class);
    @Test
    public void userMapperTest(){
        User user = userMapper.findUserById(1);
        logger.info(""+user);

    }

}