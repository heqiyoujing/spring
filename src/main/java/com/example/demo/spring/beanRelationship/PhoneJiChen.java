package com.example.demo.spring.beanRelationship;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class PhoneJiChen {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", age=" + age + "]";
    }
}
