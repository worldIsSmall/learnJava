package com.baofu.java.day05.java;

/**
 * Created by BF100427 on 2020/5/25.
 */
public class TestZoo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println("name:" + a1.name + "\tage:" + a1.age);
        a1.name = "花花";
        a1.age = 2;
        System.out.println("name:" + a1.name + "age:" + a1.age);
        a1.eat();
        a1.setName("Liu");
        System.out.println("name:" + a1.name + "age:" + a1.age);

    }
}

class Animal {
    //属性
    String name;
    int age;

    public void eat() {
        System.out.println("近视");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
