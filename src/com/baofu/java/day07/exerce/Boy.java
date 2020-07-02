package com.baofu.java.day07.exerce;

/**
 * Created by BF100427 on 2020/6/6.
 */
public class Boy {
    private String name;
    private int age;
    public Boy(){

    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void marry(Girl girl){
        System.out.println("我要娶"+girl.getName());
    }
    public void shout(){

    }
}
