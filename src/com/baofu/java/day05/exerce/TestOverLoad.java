package com.baofu.java.day05.Exerce;

/**
 * Created by BF100427 on 2020/5/27.
 */
public class TestOverLoad {
    public static void main(String[] args){
        OverLoad overLoad=new OverLoad();
        int a=overLoad.mOL(3);
        System.out.println(a);
        int b=overLoad.mOL(3,5);
        System.out.println(b);
        overLoad.mOL("hao");

        System.out.println(overLoad.max(5, 9));

        System.out.println(overLoad.max(3.67,-7.98));

        System.out.println(overLoad.max(-11.23,-3.578,-9.45));
    }
}


class OverLoad{
    public  int mOL(int i){
        return i*i;
    }
    public int mOL(int i,int j){
        return i*j;
    }
    public void mOL(String a){
        System.out.println(a);
    }

    public int max(int i,int j){
        return (i>j)?i:j;
    };
    public double max(double i,double j){
        return (i>j)?i:j;
    }
    public double max(double i,double j,double k){
        /*double max=i;
        if(max>j){
            if(max<k){
                max=k;
            }
        }else {
            if(j>k){
                max=j;
            }else {
                max=k;
            }
        }
        return max;*/
        return (max(i,j) >k)?max(i,j):k;
    }
}
