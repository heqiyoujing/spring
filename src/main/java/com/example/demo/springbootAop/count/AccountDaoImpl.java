package com.example.demo.springbootAop.count;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author: yiqq
 * @date: 2018/8/16
 * @description:
 */
public class AccountDaoImpl  extends JdbcDaoSupport implements AccountDao {
    @Override
    public void out(String outer, Integer money) {
        this.getJdbcTemplate().update("update account set money = money - ? where username = ?", money,outer);
    }

    @Override
    public void in(String inner, Integer money) {
        this.getJdbcTemplate().update("update account set money = money + ? where username = ?", money,inner);
    }
}
