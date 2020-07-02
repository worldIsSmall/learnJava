package com.baofu.java.day09.exerce.testclass;

import com.baofu.java.day09.exerce.baseclass.Circle;

/**
 * Created by BF100427 on 2020/6/13.
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3,"white",1);
        Circle circle2 = new Circle(2,"white",3);
        System.out.println(circle1.equals1(circle2));
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.toString());
    }
}
