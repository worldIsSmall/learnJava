package com.baofu.java.day08.exerce.TestClass;

import com.baofu.java.day08.exerce.baseClass.Account;

/**
 * Created by BF100427 on 2020/6/10.
 */
public class TestAccount {
    public static void main(String[] args){
        Account account = new Account(1122,20000,0.045);
        account.withdraw(30000);
        System.out.println("当前余额："+account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("当前余额："+account.getBalance()+"  月利率："+account.getMonthlyInterert());

    }
}
