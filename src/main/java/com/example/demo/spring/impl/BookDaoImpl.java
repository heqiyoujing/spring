package com.example.demo.spring.impl;

import com.example.demo.spring.BookDao;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class BookDaoImpl implements BookDao{
    @Override
    public void addBook() {
        System.out.println("di  add book");
    }
}
