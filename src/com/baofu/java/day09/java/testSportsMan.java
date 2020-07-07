package com.baofu.java.day09.java;

import java.net.SocketPermission;

/**
 * Created by BF100427 on 2020/7/3.
 * static,静态的，可以修饰属性，方法，*代码块（或初始化块），*内部类（静态放在静态域中，不再堆空间中）
 */
public class testSportsMan {
    public static void main(String[] args) {
        SportsMan s1 = new SportsMan("1", 23);
        SportsMan s2 = new SportsMan("2", 21);
        s1.name = "花花";
        s1.nation = "中国";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(SportsMan.nation);

    }
}

class SportsMan {
    //实例变量
    String name;
    int age;
    //类变量
    static String nation;

    public SportsMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show1(){
        System.out.println("age:"+age);
        System.out.println("我是一个中国的运动员");
        show();
    }
    public static void show(){
        System.out.println("nation:"+nation);
//        System.out.println("age:"+age);//静态方法只能调用内部的静态的属性或者方法
        System.out.println("我是一个运动员");

    }



    @Override
    public String toString() {
        return "SportsMan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}';
    }
}
