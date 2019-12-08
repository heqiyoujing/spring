package com.example.demo.spring.beanJavaConfig;

import org.springframework.context.annotation.Bean;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class BeanConfig {
    @Bean
    public UserDaof userDao(){
        return new UserDaof();
    }

    @Bean(name="myBookDao")
    public BookDaof bookDao(){
        return new BookDaof();
    }
}
