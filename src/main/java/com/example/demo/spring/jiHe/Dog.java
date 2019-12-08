package com.example.demo.spring.jiHe;

import java.util.List;

/**
 * @author: yiqq
 * @date: 2018/8/15
 * @description:
 */
public class Dog {
    private List<String> loves;
    private String[] interest;

    public List<String> getLoves() {
        return loves;
    }

    public void setLoves(List<String> loves) {
        this.loves = loves;
    }

    @Override
    public String toString() {
        return "User [loves=" + loves + "]";
    }

    public String[] getInterest() {
        return interest;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }
}
