package com.baofu.java.day09.exerce.baseclass;

/**
 * Created by BF100427 on 2020/6/13.
 */
public class Circle extends GeometricObject {
    private double radius;
    public Circle(){
        this.radius =1.0;
    }
    public Circle(double radius){
        this.radius =radius;
    }
    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius =radius;
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


    public boolean equals1(Object c){
        if(this == c){
            return true;
        }
        if (c instanceof Circle){
            Circle circle=(Circle)c;
            return this.getColor() == circle.getColor();
        }else{
            return false;
        }
    }

    @Override
    public boolean equals(Object c){
        if(this == c){
            return true;
        }
        if (c instanceof Circle){
            Circle circle=(Circle)c;
            return this.radius == circle.radius;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
//        return this.radius+"";
        return  String.valueOf(radius);
    }


}
