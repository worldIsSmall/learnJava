package com.baofu.java.day08.exerce.TestClass;

import com.baofu.java.day08.exerce.baseClass.CheckAccount;

/**
 * Created by BF100427 on 2020/6/10.
 */
public class TestCheckAccount {
    public static void main(String[] args){
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(5000);
        System.out.println("账户余额："+checkAccount.getBalance()+"  可透支额："+checkAccount.getOverdraft());
        checkAccount.withdraw(18000);
        System.out.println("账户余额："+checkAccount.getBalance()+"  可透支额："+checkAccount.getOverdraft());
        checkAccount.withdraw(3000);
        System.out.println("账户余额："+checkAccount.getBalance()+"  可透支额："+checkAccount.getOverdraft());


    }
}
