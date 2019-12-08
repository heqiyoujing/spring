package com.example.demo.spring.beanInitAndDestory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class App {

    public static void main(String[] args) {

		/*
		 * @PostConstruct
		 * public void init(){  等价于  init-method="init"
		 *
		 * @PreDestroy
		 * public void destory(){ 等价于 destroy-method="destory"
		 */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("intAndDestory.xml");

        Books book = (Books)context.getBean("book");

        context.close();
    }

}
