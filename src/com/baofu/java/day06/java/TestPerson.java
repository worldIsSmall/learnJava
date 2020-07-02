package com.baofu.java.day06.java;

/**
 * Created by BF100427 on 2020/6/3.
 * 类的第三个成员，构造器(constructor,构造方法)
 * 构造器的作用：
 * 1 创建对象
 * 2
 * */
public class TestPerson {
    public static void main(String[] args){
        Person p=new Person();
       System.out.println(p.getName()+"\t"+p.getAge());
        Person p1=new Person("LIUC",28);
        System.out.println(p1.getName()+"\t"+p1.getAge());
    }
}

class Person{
    //属性
    private String name;
    private int age;
    //构造器
    public Person(String n,int a){
        name=n;
        age=a;
    }
    public Person(){
        age=18;
    }

    //方法
    public void setName(String a){
        name=a;
    }
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return  age;
    }
    public String getName(){
        return name;
    }

}