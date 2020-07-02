package com.baofu.java.day04;

/**
 * Created by BF100427 on 2020/5/20.
 */
public class TestPritimive{
    public static void main(String[] args){
        Pritimive d =new Pritimive();
        for(int i=0;i<d.t.length;i++){
            System.out.println(d.t[i]);
        }
        for(int i=0;i<d.t.length;i++){
              d.t[i]=true;
            System.out.println(d.t[i]);
        }


    }
}

class Pritimive {
    boolean[] t=new boolean[3];
}
