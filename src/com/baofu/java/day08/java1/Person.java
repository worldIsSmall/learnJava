package com.baofu.java.day08.java1;

/**
 * Created by BF100427 on 2020/6/10.
 */
public class Person {
    private String name;
    private int age;
    public Person(){

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
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
//    public boolean equals(Object obj){
//        return true;
//    }




}
