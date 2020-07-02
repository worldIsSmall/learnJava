package com.baofu.java.day08.java1;
import java.lang.Object;
/**
 * Created by BF100427 on 2020/6/12.
 * equals:只能比较引用数据型变量，比较的是地址值
 */
public class TestEquals {
    public static void main(String[] args){
        int i =12;
        int j =12;
        System.out.println(i==j);
        char c =12;
        System.out.println(i==c);
        float f =12.0f;
        System.out.println(i==f);
        int k =65;
        char a ='A';
        System.out.println(k==a);

        Person p1= new Person();
        Person p2 = new Person();
        System.out.println(p1.equals(p2));
        System.out.println(p1.getClass() == p2.getClass());

        String str1 = new String("aa");
        String str2 =new String("aa");
        System.out.println(str1.equals(str2));



    }
}
