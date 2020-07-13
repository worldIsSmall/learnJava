package com.baofu.java.day10.java;

/**
 * Created by BF100427 on 2020/7/8.
 * 懒汉式:可能存在线程安全问题
 */

public class TestSingleton1 {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s1 == s2);

    }

}
class Singleton1{
    private Singleton1() {
    }
    private static Singleton1 instance ;
    public static Singleton1 getInstance(){
        if(instance == null){
            instance =new Singleton1();
        }
        return instance;
    }
}
