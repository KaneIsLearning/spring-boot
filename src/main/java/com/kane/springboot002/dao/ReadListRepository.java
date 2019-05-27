package com.kane.springboot002.dao;

import com.kane.springboot002.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈持久化接口〉
 *
 * @author dell
 * @create 2019/5/23
 * @since 1.0.0
 */
public interface ReadListRepository extends JpaRepository<Book,Long> {
    /**
     * 查询某读者的读书列表
     * @param reader
     * @return
     */
    List<Book> findByReader(String reader);
}
