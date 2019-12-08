package com.example.demo.springbootAop.count;

/**
 * @author: yiqq
 * @date: 2018/8/16
 * @description:
 */
public interface AccountService {

    /**
     *
     * @param outer
     * @param inner
     * @param money
     */
    public void transfer(String outer ,String inner ,Integer money);

}
