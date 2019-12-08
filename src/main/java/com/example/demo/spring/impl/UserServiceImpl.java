package com.example.demo.spring.impl;

import com.example.demo.spring.UserService;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("a_ico add user");
    }
}
