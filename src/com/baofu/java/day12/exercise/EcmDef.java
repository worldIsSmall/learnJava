package com.baofu.java.day12.exercise;

import java.util.Scanner;

/**
 * Created by BF100427 on 2020/7/23.
 */
public class EcmDef {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            ecm(i, j);
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e) {
            System.out.println("分母为0");
        } catch (EcDef e) {
            System.out.println(e.getMessage());
        }


    }

    public static void ecm(int i, int j) throws EcDef {
        if (i < 0 || j < 0) {
            throw new EcDef("您输入的数值存在负数");
        }
        System.out.println(i / j);
    }

}
