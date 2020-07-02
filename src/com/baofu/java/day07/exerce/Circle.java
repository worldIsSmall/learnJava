package com.baofu.java.day07.exerce;

/**
 * Created by BF100427 on 2020/6/9.
 */
public class Circle {
    private double radius;
    public Circle(){
        this.radius = 1.00;
    }
    public Circle(double radius){this.radius = radius;}
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
