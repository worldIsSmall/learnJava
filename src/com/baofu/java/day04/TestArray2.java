package com.baofu.java.day04;

/**
 * Created by BF100427 on 2020/5/21.
 */
public class TestArray2 {
    public static void main(String[] args){
        int[] scores1=new int[10];
        int[][] scorce2;
        scorce2=new int[][]{{1,2,3},{4,5}};//��̬��ʼ��
        for(int i=0;i<scorce2.length;i++){
            for(int j = 0;j<scorce2[i].length;j++){
                System.out.println(scorce2[i][j]);
            }
            System.out.println(scorce2[i].length);
        }
        String[][] names;
        names=new String[3][2];
        System.out.println(names.length);


    }
}
