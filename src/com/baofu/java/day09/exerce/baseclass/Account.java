package com.baofu.java.day09.exerce.baseclass;

/**
 * Created by hetian on 2020/7/7.
 */
public class Account {
    private int id;
    private String passWord;
    private double balance;
    private static double rate=0.05;
    private static double minBalance=100;
    private static int init=1000;

    public Account(){

    }
    public Account(String passWord, double balance) {
        id = init++;
        this.passWord = passWord;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", passWord='" + passWord + '\'' +
                ", balance=" + balance +
                ", rate=" + rate +
                ", minBalance="+rate+
                '}';
    }
}
