package com.example.demo.spring;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class User {
    private String username;
    private int age;
    private String password;
    private int money;

    public User(int money,String password) {    //构造1
        this.password = password;
        this.money = money;
    }

    public User(String username, int age) {     //构造2
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", age=" + age + ", password="
                + password + ", money=" + money + "]";
    }
}
