package com.example.demo.spring.beanRelationship;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class Doo implements ApplicationContextAware {

    private String beanId;
    private ApplicationContext applicationContext;

    public DooBase getDB(){
        return (DooBase) applicationContext.getBean(beanId);
    }

    public String getBeanId() {
        return beanId;
    }

    public void setBeanId(String beanId) {
        this.beanId = beanId;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
    }
}
