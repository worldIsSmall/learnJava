package com.baofu.java.day05.Exerce;

import com.baofu.java.day05.java.ArrayUtil;

/**
 * Created by BF100427 on 2020/5/26.
 */
public class TestArray {
    public static void main(String[] args){
        ArrayUtil arrayUtil=new ArrayUtil();
        int[] arr=new int[]{1,2,4,6,10,-45,88,85};
        int max=arrayUtil.getMax(arr);
        System.out.println("数组最大值："+max);
        int min=arrayUtil.getMin(arr);
        System.out.println("数组最小值："+min);
        int sum=arrayUtil.getSum(arr);
        System.out.println("数组的和："+sum);
        int avg=arrayUtil.avg(arr);
        System.out.println("数组的平均值："+avg);
        System.out.println("打印数组的元素：");
        arrayUtil.printArray(arr);
        System.out.println("翻转后数组的元素：");
        arrayUtil.reverse(arr);
        arrayUtil.printArray(arr);
        int[] arr1=arrayUtil.copy(arr);//数组复制
        System.out.println("数组排序并打印：");
        arrayUtil.sort(arr,"desc");
        arrayUtil.printArray(arr);
        System.out.println("打印复制的数组元素：");
        arrayUtil.printArray(arr1);

    }
}
