package com.baofu.java.day04;

/**
 * Created by BF100427 on 2020/5/22.
 * 冒泡排序
 */
public class TextExerArray1 {
    public static void main(String[] args){
        int[] arr=new int[]{2,48,5,-9,86,98,10};
        for(int i = 0;i<arr.length-1;i++){
            System.out.println("冒泡排序第"+(i+1)+"次结果：");
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int max=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=max;
                }
            }
            for(int z=0;z<arr.length;z++){
                System.out.print(arr[z]+"\t");
            }
            System.out.println();

        }
    }
}
