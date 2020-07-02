package com.baofu.java.day07.java;

/**
 * Created by BF100427 on 2020/6/6.
 * this
 * 1 可以修饰属性，方法，构造器
 * 2 this理解为当前对象或者当前正在创建的对象
 * 3 可以在构造器中通过this（形参）的方式，
 */
public class TestPerson {
}


class Person{
    private String name;
    private int age;

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }

    public Person(int age){
        this.age = age;
    }
    public Person(String name,int a){
       this(name);
        age = a;
    }

    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
     public String getName(){
         return  name;
     }
    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println("eat");
    }
    public void info(){
        System.out.println("name:"+name+" age:"+age);
    }


}