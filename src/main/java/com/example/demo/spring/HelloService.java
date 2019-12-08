package com.example.demo.spring;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class HelloService {

    private String info;					//普通字段
    public void setInfo(String info){	//为字段提供setter方法
        this.info = info;
    }

    public void sayInfo(){
        System.out.println("你好," + info);
    }

}
