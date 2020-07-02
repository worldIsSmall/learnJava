package com.baofu.java.day07.exerce;

/**
 * Created by BF100427 on 2020/6/6.
 */
public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;
    public Account(int id,double balance,double annuallnterestRate){
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnuallnterestRate(double annuallnterestRate){
        this.annuallnterestRate = annuallnterestRate;
    }
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnuallnterestRate(){
        return this.annuallnterestRate;
    }
    public void withdraw(int balance){
        if(balance <= this.balance&&balance > 0){
            this.balance-=balance;
            System.out.println("取钱成功");
        }else{
            System.out.println("余额不足或取款金额不正确");
        }
    }
    public void deposit(int balance){
        if(balance >= 0){
            this.balance += balance;
            System.out.println("存入成功:"+balance+"元");
        }else{
            System.out.println("存款金额不正确");
        }
    }

}
