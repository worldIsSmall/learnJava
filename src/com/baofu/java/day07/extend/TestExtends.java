package com.baofu.java.day07.extend;

/**
 * Created by BF100427 on 2020/6/8.
 */
public class TestExtends {
    public static void main(String[] args){
        Student student = new Student("liu");
        student.setAge(18);
        student.info();
        Person p =new Person();
        student.eat();
        student.sleep();
    }
}
