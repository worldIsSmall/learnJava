package com.baofu.java.day05.Exerce;

/**
 * Created by BF100427 on 2020/5/25.
 */
public class TestPerson {
    public static void main(String[] args){
        Person p1=new Person();
        p1.study();
        p1.showAge();
        p1.addAge(3);
        p1.showAge();
        p1.addAge(4);
        p1.showAge();

    }
}

class Person{
    String name;
    int age;
    int sex;
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println(age);
    }

    public int addAge(int i){
        age+=i;
        return age;
    }

}
