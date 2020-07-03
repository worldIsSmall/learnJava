package com.baofu.java.day09.java;

import java.net.SocketPermission;

/**
 * Created by BF100427 on 2020/7/3.
 */
public class testSportsMan {
    public static void main(String[] args) {
        SportsMan s1 =new SportsMan("1",23);
        SportsMan s2 =new SportsMan("2",21);
        System.out.println(s1);
        System.out.println(s2);
    }
}
class SportsMan{
    String name;
    int age;

    public SportsMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "SportsMan [ name="+name+",age="+age+ "]";
    }
}
