package com.baofu.java.day09.exerce.testclass;

import java.util.Vector;
import java.util.Scanner;
/**
 * Created by BF100427 on 2020/6/13.
 */
public class TestVector {
    public static void main(String[] args) {
        System.out.println("输入学生的成绩，当输入负数时，代表成绩输入结束：");
        Scanner scanner =new Scanner(System.in);
        Vector v= new Vector();
        int max = 0 ;
        for(;;){
            int i =scanner.nextInt();
            if(i > 0){
                v.addElement(i);
                if(max < i){
                    max = i;
                }
            }else {
                break;
            }
        }
        for (int i = 0;i < v.size();i++){
            String level;
            if(max-(Integer)v.elementAt(i)<= 10){
                level ="A";
            }else if(max-(Integer)v.elementAt(i)<= 20){
                level ="B";
            }else if (max-(Integer)v.elementAt(i)<= 30){
                level ="C";
            }else {
                level ="D";
            }
            System.out.println("第"+(i+1)+"个学生的成绩："+v.elementAt(i)+" 等级是："+level);
        }
    }
}
