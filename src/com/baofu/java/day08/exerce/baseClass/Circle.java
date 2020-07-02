package com.baofu.java.day08.exerce.baseClass;

/**
 * Created by BF100427 on 2020/6/11.
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius,String color,double weigth){
        super(color,weigth);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }
}
