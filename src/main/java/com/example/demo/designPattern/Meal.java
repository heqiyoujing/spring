package com.example.demo.designPattern;

/**
 * 创建对象模式三剑客的第二个成员是工厂方法设计模式。
 * 第三个抽象工厂模式
 */
public class Meal {
    private String type;

    public Meal(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    // 静态工厂方法
    public static Meal valueOf(String ingredient) {
        if (ingredient.equals("banana")) {
            return new Meal("fruit");
        }
        return new Meal("vegetable");
    }
}
