package com.example.demo.spring.beanAssemble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
@Component
public class Service {
    @Autowired
    @Qualifier("myDao")
    private Daodao dao;

    public void save(){
        dao.save();
        System.out.println("service save");
    }
}
