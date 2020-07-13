package com.baofu.java.day10.java;

/**
 * Created by BF100427 on 2020/7/10.
 * 接口是与类并行的一个概念
 * 1.接口可以看做一个特殊的抽象类，是常量和抽象方法的一个集合
 * 2.接口是没有构造器的
 * 3.接口定义的是一种功能。此功能可以被类所实现(implements) class a extends b implements c
 * 4.实现接口的类，必须要重写其中的所有抽象的方法,方可实例化
 * 5.类可以实现多个接口，java中的继承是单继承
 * 6.接口与接口之间也是继承的关系,而且可以实现多继承
 */
public class TestInterface {
    public static void main(String[] args) {
        System.out.println(A.I);
//        A.I=12;
    }
}


interface A{
    //常量：所有的常量都是用public static final修饰
   int I = 12;
   boolean FLAG= false;
    //抽象方法：所有的都用public abstract修饰
    void method1();
    void method2();
}
class C{}
class B extends C implements A{
    public void method1(){}
    public void method2(){}
}

interface D{
    void method3();
}
interface  E extends D{
    void method4();
}
class F implements E{

    @Override
    public void method4() {

    }

    @Override
    public void method3() {

    }
}
