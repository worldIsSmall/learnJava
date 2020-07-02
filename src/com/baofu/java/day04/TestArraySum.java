package com.baofu.java.day04;

/**
 * Created by BF100427 on 2020/5/21.
 */
public class TestArraySum {
    public static void main(String[] args){
        int[][] arrs=new int[3][];
        arrs[0]=new int[]{3,8,2};
        arrs[1]=new int[]{2,7};
        arrs[2]=new int[]{9,0,1,6};
        int sum=0;
        for (int i=0;i<arrs.length;i++){
            for(int j=0;j<arrs[i].length;j++){
                sum+=arrs[i][j];
            }
        }
        System.out.println(sum);
    }
}
