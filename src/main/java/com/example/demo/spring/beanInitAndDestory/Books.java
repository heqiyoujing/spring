package com.example.demo.spring.beanInitAndDestory;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
@Component("book")
public class Books {
    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁");
    }
}
