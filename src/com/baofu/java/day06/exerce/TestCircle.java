package com.baofu.java.day06.exerce;

/**
 * Created by BF100427 on 2020/5/29.
 */
public class TestCircle {
    public static void main(String[] args){
        System.out.println("Radius"+"\t"+"Area");
        PassObject pO=new PassObject();
        Circle cir=new Circle();
        int time=5;
        pO.printAreas(cir,time);
        System.out.println(time+1);

        pO.printAreas(new Circle(),6);

    }
}

class Circle{
    double radius;
    public double findArea(){
        return Math.PI*radius*radius;
    }
}


class PassObject{
    public void printAreas(Circle c,int time){
        for (int i=1;i<=time;i++){
            c.radius=i;
            System.out.print(c.radius+"\t\t");
            System.out.println(c.findArea());
        }

    }
}
