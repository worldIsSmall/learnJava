package com.baofu.java.day07.extend;

/**
 * Created by BF100427 on 2020/6/8.
 */
public class Person {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void info(){
        System.out.println("name:"+name+"  age:"+age);
    }
}
