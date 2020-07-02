package com.baofu.java.day08.exerce.baseClass;

/**
 * Created by BF100427 on 2020/6/11.
 */
public class MyRectangle extends GeometricObject {
    private double width;
    private double beight;

    public MyRectangle(double width,double height,String color,double weigth){
        super(color,weigth);
        this.width = width;
        this.beight = beight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getBeight() {
        return beight;
    }

    public void setBeight(double beight) {
        this.beight = beight;
    }
    public double findArea(){
        return weight*beight;
    }
}
