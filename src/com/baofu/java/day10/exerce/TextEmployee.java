package com.baofu.java.day10.exerce;

/**
 * Created by BF100427 on 2020/7/10.
 */
public class TextEmployee {
    public static void main(String[] args) {
        Manager m1 =new Manager();
        m1.work();
        CommonEmployee c1 =new CommonEmployee();
        c1.work();
    }
}

abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract void work();
}

class Manager extends Employee{
    double bonus;
    public void work(){
        System.out.println("Manager work");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

class CommonEmployee extends Employee{
    public void work(){
        System.out.println("CommonEmployee work");
    }
}

