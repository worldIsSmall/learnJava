package com.baofu.java.day07.exerce;

/**
 * Created by BF100427 on 2020/6/9.
 */
public class Cylinder extends Circle{
    private double length;
    public Cylinder(){
        length = 1.00;
    }
    public Cylinder(double length){
        super();
        this.length = length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public double findVolume(){
        return  super.findArea()*length;
    }
}
