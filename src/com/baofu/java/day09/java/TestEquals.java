package com.baofu.java.day09.java;

/**
 * Created by BF100427 on 2020/6/12.
 */
public class TestEquals {
    public static void main(String[] args){
        Person p1 =new Person("AA",12);
        Person p2 = new Person("AA",12);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        String str1 ="AA";
        String str2 ="AA";
        String str3 =new String("AA");
        System.out.println(str1 == str2);
        System.out.println(p1.getName() == p2.getName());



    }
}
