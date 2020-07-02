package com.baofu.java.day07.exerce;

/**
 * Created by BF100427 on 2020/6/8.
 */
public class MandKind {
    private int sex;
    private int salary;
    public void setSex(int sex){
        this.sex = sex;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void manOrWomen(){
        if (sex==1){
            System.out.println("man");
        }else if(sex == 0){
            System.out.println("women");
        }else{
            System.out.println("性别未知");
        }
    }
    public void employeed(){
        if(salary == 0){
            System.out.println("no jop");
        }else{
            System.out.println("job");
        }
    }
}
