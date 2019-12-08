package com.example.demo.springbootAop.aop;

/**
 * @author: yiqq
 * @date: 2018/8/16
 * @description:
 */
public class UserServiceImpl implements UserServicess {


    public void addUser() {
        System.out.println("b_factory_bean addUser");
    }


    public void updateUser() {
        System.out.println("b_factory_bean updateUser");

    }


    public void deleteUser() {

        System.out.println("b_factory_bean deleteUser");
    }

}
