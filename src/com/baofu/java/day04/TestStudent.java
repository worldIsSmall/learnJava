package com.baofu.java.day04;
import org.junit.Test;
import java.util.Scanner;
/**
 * Created by hetian on 2020/5/20.
 */

public class TestStudent {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int num;
        for(;;){
             num=s.nextInt();
            if(num>0){
                break;
            }else{
                System.out.println("输入数据无效，重新输入：");
            }
        }

        System.out.println("请输入"+num+"个学生的分数");
        int[] score=new int[num];
        for(int i=0;i<score.length;i++){
            for(;;){
                score[i]=s.nextInt();
                if(score[i]>0){
                    break;
                }else{
                    System.out.println("分数无效，重新输入");
                }
            }
        }

        int max=score[0];
        for(int j=0;j<score.length;j++){
           max=(max>score[j])?max:score[j];
        };
        System.out.println("最高分是："+max+"分");

        for(int z=0;z<score.length;z++){
            char level;
            if(score[z]>=max-10){
                level='A';
            }else if(score[z]>=max-20){
                level='B';;
            }else if(score[z]>=max-30){
                level='C';;
            }else{
                level='D';;
            }
            System.out.println("学生"+(z+1)+"的分数是"+score[z]+"等级是"+level);
        }

    }
}
