package com.baofu.java.day09.exerce.testclass;


import com.baofu.java.day09.exerce.baseclass.Order;

/**
 * Created by BF100427 on 2020/6/12.
 */
public class TestOrder {
    public static void main(String[] args){
        Order o1 =new Order("aa",1);
        Order o2 =new Order("aa",2);
        Order o3 =new Order("AA",1);
        Order o4 =new Order("aa",1);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.equals(o4));
        System.out.println(o2.equals(o3));



    }
}
