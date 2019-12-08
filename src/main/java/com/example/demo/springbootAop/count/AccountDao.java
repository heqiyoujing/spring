package com.example.demo.springbootAop.count;

/**
 * @author: yiqq
 * @date: 2018/8/16
 * @description:
 */
public interface AccountDao {
    /**
     * 转出
     * @param outer
     * @param money
     */
    public void out(String outer , Integer money);

    /**
     * 转入
     * @param inner
     * @param money
     */
    public void in(String inner , Integer money);

}
