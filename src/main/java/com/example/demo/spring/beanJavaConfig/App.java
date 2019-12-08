package com.example.demo.spring.beanJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class App {
    public static void main(String[] args) {

        //用于加载使用@Configuration 配置注解工厂类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //用于向 注解上下文对象 添加一个配置类
        context.register(BeanConfig.class);
        //刷新容器以应用这些注册的配置类
        context.refresh();

        UserDaof userDao = (UserDaof) context.getBean("userDao");
        System.out.println(userDao);

        BookDaof bookDao = context.getBean("myBookDao", BookDaof.class);
        System.out.println(bookDao);
    }
}
