package com.kane.springboot002.aop.service;

import com.kane.springboot002.aop.bean.User;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户服务接口〉
 *
 * @author Kane
 * @create 2019/5/29
 * @since 1.0.0
 */
@Service
public interface UserService {
    /**
     *
     * @param user
     */
    void printUser(User user);

    /**
     * 通过用户id查询用户信息
     * @param id
     * @return
     */
    User findUser(int id);
}
