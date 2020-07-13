package com.baofu.java.day10.java;

/**
 * Created by BF100427 on 2020/7/8.
 * 饿汉式
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}

class Singleton {

    //1.私有化构造器，使得在类的外部不能调用此构造器
    private Singleton() {
    }
    //提供一个类的属性
    private static Singleton instance = new Singleton();
    //
    public static Singleton getInstance(){
        return instance;
    }


}
