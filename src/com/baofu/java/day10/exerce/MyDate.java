package com.baofu.java.day10.exerce;

/**
 * Created by BF100427 on 2020/7/14.
 */
class MyDate{
    private int month;
    private int day;
    private int year;

    public MyDate(int month,int day,int year){
        this.month =month;
        this.day = day;
        this.year = year;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public String toDateString(){
        return  String.valueOf(year)+"年"+String.valueOf(month)+"月"+String.valueOf(day)+"日";
    }
}
