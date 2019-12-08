package com.example.demo.common;

/**
 * @author: yiqq
 * @date: 2018/8/11
 * @description:
 */
public class testthread {

//    public static void main(String[] args){
//        ThreadTest t = new ThreadTest();
//        t.start();
//        t.start();
//        t.start();
//        t.start();
//    }
    public static class ThreadTest extends Thread{
        private int ticket = 100;
        public void run(){
            while(true){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() +  "is selling ticket" + ticket--);
                }else{
                    break;
                }
            }
        }
    }
}
