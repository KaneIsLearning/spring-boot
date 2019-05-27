package com.kane.springboot002.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br>
 * 〈11〉
 *
 * @author Kane
 * Date:   2019/5/27 9:33
 * @since 1.0.0
 */
@Configuration
public class BookFactory  {
    private static Book book;

    @Bean(name = "book")
    public static Book getBook(){
        if(book == null){
            synchronized (BookFactory.class){
                if (book == null){
                    book = new Book();
                    book.setId(1);
                    book.setTitle("十万个为什么");
                    book.setAuthor("阿杜");
                }
            }
        }
        return book;
    }

}