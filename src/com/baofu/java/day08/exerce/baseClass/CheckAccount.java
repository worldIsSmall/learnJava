package com.baofu.java.day08.exerce.baseClass;

/**
 * Created by BF100427 on 2020/6/10.
 */
public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount(int id,double balance,double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }

    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }

    public double getOverdraft(){
        return overdraft;
    }

    public void withdraw(double balance){
        if(balance <= this.getBalance()){
           super.setBalance(getBalance()-balance);
        }else {
            if(overdraft+this.getBalance() >=balance){
                this.overdraft =overdraft+getBalance()-balance;
                setBalance(0);
            }else{
                System.out.println("超出可透支额的限额");
            }
        }
    }

}
