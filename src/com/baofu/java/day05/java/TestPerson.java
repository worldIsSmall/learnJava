package com.baofu.java.day05.java;

/**
 * Created by BF100427 on 2020/5/25.
 */
public class TestPerson {
    public static void main(String[] args){
        Person p1=new Person();
        p1.info();
        p1.age=20;
        System.out.println(p1.desc());
    }
}

class Person{
    //1属性（成员变量或field）：
    String name;
    int age;
    boolean sex;
    //2.方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }
    public String getName(){
        return  name;
    }
    public void setName(String n){
        name=n;
    }
    public void info(){
        eat();
        sleep();
        System.out.println("name:"+name+"  age:"+age);
    }
    public String desc() {
        if (age>18) {
            return "超过了18";
        }else{
            return "没有超过18";
        }
        }
    }


