package com.example.demo.springbootAop.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author: yiqq
 * @date: 2018/8/16
 * @description:
 */
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {

        System.out.println("使用前......");

        // 。。。。。。。
        Object obj = mi.proceed();

        System.out.println("使用后......");
        return obj;
    }
}
