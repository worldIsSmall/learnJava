package com.baofu.java.day11;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by BF100427 on 2020/7/21.
 */
public class TestException1 {
    //类型不匹配异常 InputMismatchException
    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        try {
            i = s.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e) {
            System.out.println("出现了类型不匹配的异常");
        }


    }

    //数组的下标越界 ArrayIndexOutOfBoundsException
    @Test
    public void test2() {
        try {
            int[] i = new int[10];
            System.out.println(i[10]);
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("数组的下标越界");
//        }
        catch (Exception e) {
            System.out.println("出现异常");
        }

    }

    //ArithmeticException,算数异常
    @Test
    public void test3() {
        try {
            int i = 10;
            System.out.println(i / 0);
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println( e.getMessage());
        }
    }

    //类型转换异常 ClassCastException
    @Test
    public void test4() {
        try {
            Object obj = new Date();
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("出现类型转换的异常");
            System.out.println(1 + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //空指针异常
    @Test
    public void test5() {
        try {
            String str = new String("AA");
            str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //编译时异常
    @Test
    public void test() {
        FileInputStream fis =null;
        try {
            fis = new FileInputStream(new File("hello1.txt"));
            int b;
            while ((b = fis.read()) != -1) {
                System.out.println((char) b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
