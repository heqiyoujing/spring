package com.example.demo.spring.beanAssemble;

import org.springframework.stereotype.Component;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
@Component("myDao")
public class Daodao {
    public void save(){
        System.out.println("dao save");
    }
}
