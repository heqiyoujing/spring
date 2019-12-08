package com.example.demo.springbootAop.count.countOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yiqq
 * @date: 2018/8/16
 * @description:
 */
public class TestAppOne {
    public static void main(String[] args) {
        String xmlPath = "applicationContextOne.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountServiceOne accountService =  (AccountServiceOne) applicationContext.getBean("accountService");
        accountService.transfer("jack", "rose", 1000);
    }
}
