package com.baofu.java.day08.exerce.baseClass;

/**
 * Created by BF100427 on 2020/6/11.
 */
public class Student extends Person{
    protected String school= "pku";
    public String getInfo(){
        return "Name:"+name+"\n"+"age:"+age+"\nschool:"+school;
    }

}
