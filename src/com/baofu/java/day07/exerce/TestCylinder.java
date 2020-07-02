package com.baofu.java.day07.exerce;

/**
 * Created by BF100427 on 2020/6/9.
 */
public class TestCylinder {
    public static void main(String[] args){
        Cylinder cylinder=new Cylinder();
        System.out.println("默认圆柱的体积："+cylinder.findVolume());
        cylinder.setLength(2.12);
        cylinder.setRadius(3.23);
        System.out.println("圆的面积："+cylinder.findArea());
        System.out.println("圆柱的体积："+cylinder.findVolume());

        Cylinder cylinder1 = new Cylinder(2);
        System.out.println("圆柱1的体积："+cylinder1.findVolume());
//        System.out.println(Cylinder.class.getSuperclass().getName());//打印Cylinder父类的名字






    }



}
