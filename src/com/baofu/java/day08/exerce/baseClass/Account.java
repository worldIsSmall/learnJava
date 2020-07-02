package com.baofu.java.day08.exerce.baseClass;

/**
 * Created by BF100427 on 2020/6/10.
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public int getId(){
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public double getMonthlyInterert(){
        return annualInterestRate/12;
    }
    public void withdraw(double balance){
        if(this.balance >= balance){
            this.balance-=balance;
        }else{
            System.out.println("余额不足");
        }
    }
    public void deposit(double balance){
        if(balance > 0){
            this.balance+=balance;
        }else{
            System.out.println("存款失败");
        }
    }

}
