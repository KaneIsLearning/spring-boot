package com.kane.springboot002.data.mapper;

import com.kane.springboot002.aop.bean.User;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户持久层接口〉
 *
 * @author Kane
 * @create 2019/5/30
 * @since 1.0.0
 */
public interface UserMapper {

    User findUserById(int id);

}
