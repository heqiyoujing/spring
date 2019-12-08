package com.example.demo.springbootAop.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yiqq
 * @date: 2018/8/16
 * @description:
 */
public class TestFactoryBean {
    public static void main(String[] args) {
        String xmlPath = "aopbeans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        //
        UserServicess userService = (UserServicess) applicationContext.getBean("proxyServiceId");
        userService.addUser();
//        userService.updateUser();
//        userService.deleteUser();
    }
}
