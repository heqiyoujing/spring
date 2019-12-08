package com.example.demo.spring.functionSetter;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class UserServices {
    private Dao dao = new UserMySqlDao();

    public Dao getDao() {
        return dao;
    }

    public void find(){
        getDao().find();
    }
}
