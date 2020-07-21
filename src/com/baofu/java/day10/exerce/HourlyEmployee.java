package com.baofu.java.day10.exerce;

/**
 * Created by BF100427 on 2020/7/14.
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double earnings(){
        return  wage*hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{"+super.toString() +
                ",wage=" + wage +
                ", hour=" + hour +
                '}';
    }
}
