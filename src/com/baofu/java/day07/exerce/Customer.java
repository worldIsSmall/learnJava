package com.baofu.java.day07.exerce;

/**
 * Created by BF100427 on 2020/6/6.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;
    }
    public void setFirstName(String f){
        this.firstName = f;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String l){
        this.firstName = l;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAccount(Account account){
        this.account = account;
    }
    public Account getAccount(){
        return account;
    }
}
