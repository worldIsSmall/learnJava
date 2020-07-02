package com.baofu.java.day06.exerce;

/**
 * Created by BF100427 on 2020/6/4.
 */
public class TestPerson2 {
    public static void main(String[] args){
        Person2 p1=new Person2("liu",18);
        p1.info();
        Person2 p2=new Person2("li",20,"xinhua");
        p2.info();
        Person2 p3=new Person2("ZHANG",30,"YIZHONG","HH");
        p3.info();
    }
}

class Person2{
    private String name;
    private int age;
    private String school;
    private String major;

    public Person2(String n ,int a){
        name = n;
        age = a;
    }
    public Person2(String n,int a,String s){
        name = n;
        age = a;
        school = s;
    }
    public Person2(String n,int a,String s,String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }
    public void info(){
        System.out.println("name:"+name+"\tage:"+age+"\tschool:"+school+"\tmajor:"+major);
    }
}
