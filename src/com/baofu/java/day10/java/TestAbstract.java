package com.baofu.java.day10.java;

/**
 * Created by BF100427 on 2020/7/10.
 */
public class TestAbstract {
    public static void main(String[] args) {
//        Person p1 =new Person();//抽象类不能实例化
        Student s1 =new Student();
        Person p2 = new Student();
        if (p2 instanceof Person){
            System.out.println("11");
        }
    }
}

abstract class Person{
    String name;
    public abstract void eat();//抽象类可以不需要方法体，｛｝
    public abstract void walk();

    public String getName(){
        return  name;
    };
    public void setName(String name) {
        this.name = name;
    }
}

class Student extends  Person{
    public void eat(){
        System.out.println("学生吃饭");
    }
    public void walk(){
        System.out.println("学生走路");
    }

}


