package com.baofu.java.day05.java;

/**
 * Created by hetian on 2020/5/27.
 * 方法的重载（OverLoad）
 * 要求，1，同一个类中 2，方法名必须相同 3 方法的参数列表不同（1.参数个数不同 2参数类型不同）
 * 补充：方法的重载和返回值类型不同
 */
public class TestOverLoad {

    //定义两个int型变量的和
    public int getSum(int i,int j){
        return i+j;
    }
    //定义三个int型变量的和
    public int getSum(int i,int j,int z){
        return i+j+z;
    }
    //定义两个double型变量的和
    public double getSum(double i,double j){
        return i+j;
    }
    //定义三个double型变量的和
    public void getSum(double i,double j,double k){
        System.out.println(i+j+k);
}


}
