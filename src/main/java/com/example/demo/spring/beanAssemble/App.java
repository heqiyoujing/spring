package com.example.demo.spring.beanAssemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class App {

    public static void main(String[] args) {

		/*
		 * @Component 在spring2.5配置所有的内容
		 * @Autowired 默认按照类型进行注入。如果有多个相同的类型，则按照名称进行注入
		 */
        ApplicationContext context = new ClassPathXmlApplicationContext("assemble.xml");

        Web web = (Web)context.getBean("myweb");

        web.save();
    }

}
