package com.example.demo.spring;

import com.example.demo.spring.beanRelationship.Daos;
import com.example.demo.spring.beanRelationship.Doo;
import com.example.demo.spring.beanRelationship.PhoneJiChen;
import com.example.demo.spring.functionSetter.UserServices;
import com.example.demo.spring.jiHe.Dog;
import com.example.demo.spring.jiHe.UserMap;
import com.example.demo.spring.jiHe.UserProperty;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
@RestController
public class TestController {

    /**
     * ApplicationContext获取bean
     */
    @RequestMapping("/test")
    public String test(){
        //从spring容器获得
        //1 获得容器
        String xmlPath = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //2获得内容 --不需要自己new，都是从spring容器获得
        UserService userService = (UserService) applicationContext.getBean("userServiceId");
        userService.addUser();
        return "success";
    }
    /**
     * BeanFactory获取bean
     */
    @RequestMapping("/test1")
    public String test1(){
        //从spring容器获得
        //1 获得容器
        String xmlPath = "beans.xml";
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath));
        UserService userService = (UserService) beanFactory.getBean("userServiceId");
        userService.addUser();
        return "success";
    }

    /**
     * ClassPathXmlApplicationContext获取bean
     */
    @RequestMapping("/test2")
    public String test2(){
        //从spring容器获得
        //1 获得容器
        String xmlPath = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = context.getBean(UserService.class);
        userService.addUser();
        return "success";
    }

    /**
     * ApplicationContext获取bean
     * 通过set方法注入
     */
    @RequestMapping("/test4")
    public String test4(){
        //从spring容器获得
        //1 获得容器
        String xmlPath = "bookBeans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService = (BookService) applicationContext.getBean("bookServiceId");
        bookService.addBook();
        return "success";
    }

    /**
     * hello获取bean
     * 通过spring容器，给HelloService类的info属性注入“传智播客”
     */
    @RequestMapping("/hello")
    public String hello(){
        //使用spring 控制反转，交予spring创建对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("helloBeans.xml");
        HelloService servcie = (HelloService) applicationContext.getBean("helloService");
        //servcie.setInfo("传智播客");
        servcie.sayInfo();
        return "success";
    }

    /**
     * user手动装配，构造方法
     */
    @RequestMapping("/user")
    public String user(){
        //使用spring 控制反转，交予spring创建对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = (User) applicationContext.getBean("injectConstructorUser");
        System.out.println(user);
        return "success";
    }

    /**
     * student，setter方法
     */
    @RequestMapping("/student")
    public String student(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("studentBeans.xml");
        Student student = (Student) applicationContext.getBean("propertyInjectUser");
        System.out.println(student);
        return "success";
    }

    /**
     * 方法注入
     */
    @RequestMapping("/method")
    public String method(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("methodBeans.xml");

        UserServices userServices = (UserServices) applicationContext.getBean("methodUserService");
        userServices.find();
        return "success";
    }

    /**
     * list/array集合
     */
    @RequestMapping("/list")
    public String list(){
        ApplicationContext context = new ClassPathXmlApplicationContext("dogBeans.xml");

        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.getLoves());
        System.out.println(Arrays.toString(dog.getInterest()));
        return "success";
    }

    /**
     * map集合
     */
    @RequestMapping("/map")
    public String map(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserMapBeans.xml");
        UserMap user = (UserMap) context.getBean("user");
        System.out.println(user.getData());
        return "success";
    }

    /**
     * map集合
     */
    @RequestMapping("/property")
    public String property(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserPropertyBeans.xml");
        UserProperty user = (UserProperty) context.getBean("user");
        System.out.println(user.getProperties());
        return "success";
    }

    /**
     * beans关系，继承
     */
    @RequestMapping("/jichen")
    public String phoneJiChen(){
        ApplicationContext context = new ClassPathXmlApplicationContext("PhoneJiChen.xml");
        PhoneJiChen user1 = (PhoneJiChen) context.getBean("user1");
        System.out.println(user1);
        PhoneJiChen user2 = (PhoneJiChen) context.getBean("user2");
        System.out.println(user2);
        PhoneJiChen user3 = (PhoneJiChen) context.getBean("user3");
        System.out.println(user3);
        PhoneJiChen user4 = (PhoneJiChen) context.getBean("user4");
        System.out.println(user4);
        return "success";
    }

    /**
     * beans关系，依赖。配置了depends-on="db"，先运行db
     */
    @RequestMapping("/yilai")
    public String yilai(){
        ApplicationContext context = new ClassPathXmlApplicationContext("yilaiBeans.xml");
        Daos dao = (Daos) context.getBean("dao");
        System.out.println(dao);
        return "success";
    }

    /**
     * beans关系，引用。
     */
    @RequestMapping("/yinyong")
    public String yinyong(){
        ApplicationContext context = new ClassPathXmlApplicationContext("yinyongBeans.xml");
        Doo dao = (Doo) context.getBean("dao");
        System.out.println(dao.getBeanId());
        System.out.println(dao.getDB());
        return "success";
    }

}
