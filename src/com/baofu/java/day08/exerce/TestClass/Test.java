package com.baofu.java.day08.exerce.TestClass;

import com.baofu.java.day08.exerce.baseClass.GeometricObject;

/**
 * Created by BF100427 on 2020/6/11.
 */
public class Test {
    public static void main(String[] args){
        Test t =new Test();

    }
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        if(g1.findArea()==g2.findArea()){
            return true;
        }else{
            return false;
        }
    }
    public double displayGeometricObject(GeometricObject g){
        return g.findArea();
    }
}
