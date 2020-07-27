package com.baofu.java.day12;

/**
 * Created by BF100427 on 2020/7/22.
 */
public class TestFinally {
    public static void main(String[] args) {
        int i = method1();
        System.out.println(i);
    }

    public static int method1() {
        try {
            System.out.println("bb");
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("aa");
//            return 2;
        }
        return  2;
    }
}
