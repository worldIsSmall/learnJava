package com.baofu.java.day06.java;

/**
 * Created by BF100427 on 2020/6/3
 * 面向对象的特征1：封装与隐藏
 * 1 当创建了累的对象后，如果直接对属性进行赋值，可能会出现不符合实际情况的意外，如legs，不能是负数..通过方法来实现
 * 权限修饰符：public private 缺省 protected
 * 可以修饰属性和方法
 *
 */
public class TestAnimal {
    public static void main(String[] args){
        Animal a1=new Animal();
        a1.name="huahua";
//        a1.legs=4;
        a1.setLegs(3);
        a1.eat();
        a1.sleep();
        a1.info();
    }

}

class Animal{
     protected String name;
    //private,修饰的属性，只能在本类中使用
   private int legs;
    public void eat(){
        System.out.println("chi");
    }
    public void sleep(){
        System.out.println("SHUI");
    }
    public void info(){
        System.out.println("name:"+name+"\t\tlegs:"+legs);
    }
    public void setLegs(int i){
        if(i > 0 &&  i% 2==0){
            legs=i;
        }else {
            System.out.println("输入有误");
        }
    }
    public int getLegs(){
        return legs;
    }
}