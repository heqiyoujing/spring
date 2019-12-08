package com.example.demo.spring.jiHe;

import java.util.Map;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class UserMap {
    private Map<String,Book> data;

    public Map<String, Book> getData() {
        return data;
    }

    public void setData(Map<String, Book> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UserMap{" +
                "data=" + data +
                '}';
    }
}
