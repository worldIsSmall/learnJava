package com.baofu.java.day06.exerce;

/**
 * Created by BF100427 on 2020/6/4.
 */
public class TestTriAngle {
    public static void main(String[] args){
      TriAngle triAngle=new TriAngle();
        triAngle.setBase(3);
        triAngle.setHigh(5);
        double area=triAngle.getBase()*triAngle.getHigh()/2;
        System.out.println("三角形的面积:"+area);
        System.out.println("三角形的面积2:"+triAngle.getArea());
    }
}

class TriAngle{
    private double base;
    private double high;

    public TriAngle(){
    }
    public void setBase(int i){
        base= i ;
    }
    public void setHigh(int j){
        high = j;
    }
    public double getBase(){
        return base;
    }
    public double getHigh(){
        return high;
    }
    public double getArea(){
        return base*high/2;
    }

}