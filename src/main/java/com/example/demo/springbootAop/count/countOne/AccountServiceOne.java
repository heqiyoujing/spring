package com.example.demo.springbootAop.count.countOne;

/**
 * @author: yiqq
 * @date: 2018/8/16
 * @description:
 */
public interface AccountServiceOne {

    /**
     *
     * @param outer
     * @param inner
     * @param money
     */
    public void transfer(String outer ,String inner ,Integer money);

}
