package com.example.demo.springbootAop.count.countOne;

import com.example.demo.springbootAop.count.AccountDao;
import com.example.demo.springbootAop.count.AccountService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: yiqq
 * @date: 2018/8/16
 * @description:
 */
@Transactional(propagation= Propagation.REQUIRED , isolation = Isolation.DEFAULT)
public class AccountServiceImplOne implements AccountServiceOne {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    @Override
    public void transfer(String outer, String inner, Integer money) {
        accountDao.out(outer, money);
        //
        //int i = 1/0;
        accountDao.in(inner, money);
    }
}
