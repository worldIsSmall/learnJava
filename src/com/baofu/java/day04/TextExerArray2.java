package com.baofu.java.day04;

import java.util.Arrays;

/**
 * Created by BF100427 on 2020/5/23.
 * 直接选择排序
 */
public class TextExerArray2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 48, 5, -9, 86, 98, 10};
        for(int i=0;i<arr.length-1;i++){
            for(int j = i;j<arr.length-1;j++){
                if(arr[i]>arr[j+1]){
                    int min=arr[j+1];
                    arr[j+1]=arr[i];
                    arr[i]=min;
                }
                }
            for(int z=0;z<arr.length;z++){
                System.out.print(arr[z]+"\t");
            }
            System.out.println();
        }
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
