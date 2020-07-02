package com.baofu.java.day07.exerce;

/**
 * Created by BF100427 on 2020/6/8.
 */
public class Kids extends MandKind {
    private int yearsOld;
    public void setYearsOld(int yearsOld){
        this.yearsOld = yearsOld;
    }
    public void printAge(){
        System.out.println(yearsOld);
    }
    public void employeed(){
       System.out.println("Kids should study and no job");
    }

    public static void main(String[] args){
        Kids someKid =new Kids();
        someKid.setSalary(1000);
        someKid.setSex(0);
        someKid.setYearsOld(34);
        someKid.manOrWomen();
        someKid.employeed();
        someKid.printAge();
    }
}
