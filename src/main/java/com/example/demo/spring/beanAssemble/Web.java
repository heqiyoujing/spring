package com.example.demo.spring.beanAssemble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
@Component("myweb")
public class Web {
    @Autowired
    private Service service;

    public void save(){
        service.save();
        System.out.println("web save");
    }
}
