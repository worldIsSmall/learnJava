package com.baofu.java.day10.exerce;

/**
 * Created by BF100427 on 2020/7/14.
 */
class SalariedEmployee extends Employee{
    private double monthlySalary;
    public double earnings(){
        return this.monthlySalary;
    }
    public SalariedEmployee(String name,int number,MyDate myDate,double monthlySalary){
        super(name,number,myDate);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{"+super.toString() +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
