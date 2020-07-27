package com.baofu.java.day12;

/**
 * Created by BF100427 on 2020/7/23.
 */
public class TestCircle {
    public static void main(String[] args)  {
        Circle c1 = new Circle(2.1);
        Circle c2 = new Circle(3.2);
        try {
            System.out.println(c1.compareTo(c2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(c1.compareTo(new String("AA")));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Circle{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public int compareTo(Object obj) throws MyException{
        if (this == obj){
            return 0;
        }
        if (obj instanceof Circle){
            Circle c =(Circle)obj;
             if (this.radius > c.radius){
                 return 1;
             }else if (this.radius == c.radius){
                 return 0;
             }else {
                return  -1;
            }
        }else {
//            throw new RuntimeException("传入类型有误");
            throw new MyException("传入类型有误");
        }

    }

}
