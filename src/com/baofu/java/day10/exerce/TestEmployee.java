package com.baofu.java.day10.exerce;

/**
 * Created by BF100427 on 2020/7/14.
 */
public class TestEmployee {
    public static void main(String[] args) {
        HourlyEmployee h1 = new HourlyEmployee("六一",100001,new MyDate(3,18,1991),100,6);
        System.out.println(h1.toString());
    }
}
