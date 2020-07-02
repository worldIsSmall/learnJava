package com.baofu.java.day07.exerce;

/**
 * Created by BF100427 on 2020/6/6.
 */
public class TestCustomer {
    public static void main(String[] args){
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,1.23);
        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println("客户 "+customer.getFirstName()+","+customer.getLastName()+"的帐号："+customer.getAccount().getId()+"，余额："+customer.getAccount().getBalance()+",年利率："+customer.getAccount().getAnnuallnterestRate()+"%");
    }
}
