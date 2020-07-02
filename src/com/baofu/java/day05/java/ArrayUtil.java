package com.baofu.java.day05.java;

/**
 * Created by BF100427 on 2020/5/26.
 */
public class ArrayUtil {
    //求数组最大值
    public int getMax(int[] n) {
        int max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }

    //求数组的最小值
    public int getMin(int[] n) {
        int min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        return min;
    }

    //遍历数组元素
    public void printArray(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+"\t");
        }
        System.out.println();

    }
    //求数组的平均数
    public int avg(int[] n){
        int avg=getSum(n)/n.length;
        return avg;
    }
    //求数组的总和
    public int getSum(int[] n){
        int sum=0;
        for (int i=0;i<n.length;i++){
            sum+=n[i];
        }
        return sum;
    }
    //数组的翻转
    public int[] reverse(int[] n){
        for(int i=0;i<n.length/2;i++){
            int a;
            a=n[i];
            n[i]=n[n.length-1-i];
            n[n.length-1-i]=a;
        }
        return n;
    }
    //复制
    public int[] copy(int[] n){
        int[] arr=new int[n.length];
        for(int i=0;i<n.length;i++){
            arr[i]=n[i];
        }
        return arr;
    }
    //排序
    public void sort(int[] n,String desc) {
        if (desc =="asc") {
            for (int i = 0; i < n.length - 1; i++) {
                for (int j = 0; j < n.length - i - 1; j++) {
                    if (n[j] > n[j + 1]) {
                        swap(n,j,j+1);
                    }
                }
            }
        }else if (desc=="desc"){
            for (int i = 0; i < n.length - 1; i++) {
                for (int j = 0; j < n.length - i - 1; j++) {
                    if (n[j] < n[j + 1]) {
                       swap(n,j,j+1);
                    }
                }
            }
        }else {
            System.out.println("输入的排序方式不正确");
        }
    }
    //交换数组中指定位置的元素,交换数组n中索引为i和j的两个元素
    public void swap(int[] n,int i,int j){
        int a=n[i];
        n[i]=n[j];
        n[j]=a;
    }
}
