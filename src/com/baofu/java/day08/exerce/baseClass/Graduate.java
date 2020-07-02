package com.baofu.java.day08.exerce.baseClass;

/**
 * Created by BF100427 on 2020/6/11.
 */
public class Graduate extends Student{
    public String major ="IT";
    public String getInfo(){
        return   "Name:"+name+"\n"+"age:"+age+"\nschool:"+school+"\nmajor:"+major;
    }
}
