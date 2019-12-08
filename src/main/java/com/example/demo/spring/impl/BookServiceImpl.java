package com.example.demo.spring.impl;

import com.example.demo.spring.BookDao;
import com.example.demo.spring.BookService;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class BookServiceImpl implements BookService {
    // 方式1：之前，接口=实现类
    //	private BookDao bookDao = new BookDaoImpl();
    // 方式2：接口 + setter(set方法注入)
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void addBook(){
        this.bookDao.addBook();
    }
}
