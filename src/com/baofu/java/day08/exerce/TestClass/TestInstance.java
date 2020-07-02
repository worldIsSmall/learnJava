package com.baofu.java.day08.exerce.TestClass;

import com.baofu.java.day08.exerce.baseClass.Graduate;
import com.baofu.java.day08.exerce.baseClass.Person;
import com.baofu.java.day08.exerce.baseClass.Student;

/**
 * Created by BF100427 on 2020/6/11.
 */
public class TestInstance {
    public static void main(String[] args){
        TestInstance ti=new TestInstance();
        ti.method1(new Person());
        System.out.println();
        ti.method1(new Student());
        System.out.println();
        ti.method1(new Graduate());

    }

    public void method1(Person e){
        System.out.println(e.getInfo());
        if(e instanceof Graduate){
            System.out.println("a graduate student");
        }
        if(e instanceof Student){
            System.out.println("a student");
        }
        if(e instanceof Person){
            System.out.println("a person");
        }


    }
}
