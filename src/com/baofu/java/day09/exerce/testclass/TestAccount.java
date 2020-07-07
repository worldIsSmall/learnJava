package com.baofu.java.day09.exerce.testclass;
import  com.baofu.java.day09.exerce.baseclass.Account;
/**
 * Created by hetian on 2020/7/7.
 */
public class TestAccount {
    public static void main(String[] args) {
        Account.setMinBalance(100);
        Account a1 =new Account("lcd123",100.00);
        Account a2 = new Account("lcd123",20);
        Account a3 = new Account("lcd1234",30);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
