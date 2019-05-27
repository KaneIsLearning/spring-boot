package com.kane.springboot002.controller;

import com.kane.springboot002.bean.Book;
import com.kane.springboot002.bean.BookFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 〈一句话功能简述〉<br>
 * 〈c〉
 *
 * @author Kane
 * Date:   2019/5/27 9:18
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IoCTest {

    @Test
    public void bookTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(BookFactory.class);
        Book book = ac.getBean(Book.class);
        System.out.println(book);
    }

}