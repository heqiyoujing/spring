package com.example.demo.designPattern;

/**
 * 单例模式
 */
public class SingletonTest {
    public static void main(String[] args) {
        President president1 = (President) SingletonsHolder.PRESIDENT.getHoldedObject();
        President president2 = (President) SingletonsHolder.PRESIDENT.getHoldedObject();
        System.out.println(president1 == president2);
        System.out.println("president1 = "+president1+" and president2 = "+president2);
    }
}

enum SingletonsHolder {

    PRESIDENT(new President());

    private Object holdedObject;

    private SingletonsHolder(Object o) {
        this.holdedObject = o;
    }

    public Object getHoldedObject() {
        return this.holdedObject;
    }
}

class President {
}
