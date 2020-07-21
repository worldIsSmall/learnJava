package com.baofu.java.day10.exerce;

/**
 * Created by BF100427 on 2020/7/13.
 */
public class TestCompare {
    public static void main(String[] args) {
        CompareCircle c1 =new CompareCircle(3.6);
        CompareCircle c2 =  new CompareCircle(3.6);
        if (c1.compareTo(c2) == 0){
            System.out.println("两个圆的半径一样大");
        }else if(c1.compareTo(c2)>0){
            System.out.println("c1的半径大于c2的");
        }else {
            System.out.println("c1的半径小于c2的");
        }
//        int i4 = c1.compareTo(new String());

        ComparableRectangle cr1 =new ComparableRectangle(3.4,2);
        ComparableRectangle cr2 =new ComparableRectangle(2.2,3);
        if (cr1.compareTo(cr2) == 0){
            System.out.println("矩形面积一样");
    }else if (cr1.compareTo(cr2) > 0){
            System.out.println("cr1的面积大于cr2");
        }else{
            System.out.println("cr1的面积小于cr2");
        }



    }
}

interface CompareObject{
     int compareTo(Object o);
}

class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class CompareCircle extends Circle implements CompareObject{

    public CompareCircle(double radius){
        setRadius(radius);
    }

    public int compareTo(Object o){
        if (this==o){
            return 0;
        }
        if (o instanceof CompareCircle) {
            CompareCircle co = (CompareCircle) o;
            if (co.getRadius() == this.getRadius()) {
                return 0;
            } else if (co.getRadius() > this.getRadius()) {
                return -1;
            } else {
                return 1;
            }
        }else{
            throw  new RuntimeException("对象是非CompareCircle类型，不能进行比较");
        }
    }
}

class Rectangle{
    private double lenght;
    private double weight;
    public Rectangle(double lenght,double weight){
        this.lenght =lenght;
        this.weight =weight;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double area(){
        return  lenght*weight;
    }
}

class ComparableRectangle extends Rectangle implements CompareObject{
    public ComparableRectangle(double lengh,double weight ){
        super(lengh, weight);
    }
    public int compareTo(Object o){
        ComparableRectangle cr =(ComparableRectangle)o;
        if(cr.area() == this.area()){
            return 0;
        }else if (cr.area() > this.area()){
            return -1;
        }else{
            return 1;
        }
    }
}