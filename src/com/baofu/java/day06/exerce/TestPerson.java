package com.baofu.java.day06.exerce;

/**
 * Created by BF100427 on 2020/6/3.
 */
public class TestPerson {
    public static void main(String[] args){
        Person p=new Person();
//        p.setAge(30);
        System.out.println("年龄："+p.getAge());
        p.setAge(230);
        System.out.println("年龄："+p.getAge());
    }
}

class Person{
    private int age;
    public void setAge(int i){
        if(i > 0 && i <= 130){
            age=i;
        }else{
            System.out.println("输入的年龄有误");
        }
    }
    public int getAge(){
        return age;
    }
}
