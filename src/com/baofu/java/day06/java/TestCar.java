package com.baofu.java.day06.java;

/**
 * Created by BF100427 on 2020/5/29.
 */
public class TestCar {
    public static void main(String[] args){
        Factory f=new Factory();
        Car car=f.productCar("法拉利",4);
        f.desc(car);
        Car car1=f.produceCar();
        car1.info();
        f.desc(car1);
    }
}


class Factory{
    public Car produceCar(){
        return  new Car();
    }

    public Car productCar(String n,int w){
        Car c=new Car();
        c.name=n;
        c.wheel=w;
        return  c;
    }
     public void desc(Car c){
         c.info();
     }
}

class Car{
    //1.属性
    String name;
    int wheel;
    //2.方法
    public void info(){
        System.out.println("name:"+name+"wheel:"+wheel);
    }
    public String getName(){
        return name;
    }
}
