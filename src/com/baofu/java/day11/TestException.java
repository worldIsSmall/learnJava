package com.baofu.java.day11;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by BF100427 on 2020/7/15.
 */
public class TestException{

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(i);
    }
    @Test
    public void test() throws Exception{
        FileInputStream fis = new FileInputStream(new File("hello1.txt"));
        int b;
        while((b = fis.read()) != -1){
            System.out.println((char)b);
        }
        fis.close();
    }




}
