package com.baofu.java.day04;

/**
 * Created by BF100427 on 2020/5/21.
 * �����о������ֵ��쳣
 */
public class TestException {
    public static void main(String[] args){
        //1.�����±�Խ���쳣,ArrayIndexOutOfBoundsException
        int [] i=new int[10];
//        i[10]=99;
        //2.��ָ���쳣,NullPointerException
//        boolean[] b=new boolean[3];
//        b=null;
//        System.out.println(b[0]);

//        String[] str=new String[3];
//        System.out.println(str[1].toString());

        int[][] j=new int[3][];
        j[2]=new int[2];
        j[2][0]=12;


    }
}
