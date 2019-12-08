package com.example.demo.designPattern;

/**
 * @author: yiqq
 * @date: 2018/8/16
 * @description:
 */
public class App {
    public static void main(String[] args) {

        //建设者模式
        Programmer programmer = new Programmer.ProgrammerBuilder()
                .setFirstName("F").setLastName("L")
                .setCity("City").setZipCode("0000A").setAddress("Street 39")
                .setLanguages(new String[] {"bash", "Perl"})
                .setProjects(new String[] {"Linux kernel"}).build();
        System.out.println(programmer.toString());

        //工厂模式
        Meal fruit = Meal.valueOf("banana");
        Meal vegetable = Meal.valueOf("carrot");
        System.out.println(fruit.getType().equals("fruit"));
        System.out.println(vegetable.getType().equals("vegetable"));

        //
    }
}
