package com.kane.springboot002.data;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * 〈一句话功能简述〉<br>
 * 〈数据源展示〉
 *
 * @author Kane
 * Date:   2019/5/29 16:20
 * @since 1.0.0
 */
@Component
public class DataSourceShow implements ApplicationContextAware {

    ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println("---------------------数据连接池---------------------");
        System.out.println(dataSource.getClass().getName());
        System.out.println("--------------------------------------------");
    }
}