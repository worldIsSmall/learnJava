package com.baofu.java.day04;

import java.util.Scanner;

/**
 * Created by BF100427 on 2020/5/22.
 */
public class TestYangHui {
    public static void main(String[] args) {
        System.out.println("打印几行的杨辉三角，请输入：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        int n=10;
        System.out.println("打印结果如下:");
        int[][] arr = new int[n][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
