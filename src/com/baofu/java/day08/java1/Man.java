package com.baofu.java.day08.java1;

/**
 * Created by BF100427 on 2020/6/10.
 */
public class Man extends Person{
    private boolean smoking;

    public Man(){

    }
    public void setIsSmoking(boolean smoking){
        this.smoking = smoking;
    }
    public boolean getIsSmoking(){
        return smoking;
    }
    public void eat(){
        System.out.println("男人吃饭");
    }
    public void sleep(){
        System.out.println("男人睡觉");
    }

}
