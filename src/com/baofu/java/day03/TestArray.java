package com.baofu.java.day03;

/**
 * Created by BF100427 on 2020/5/16.
 */
public class TestArray {
    public static void main(String[] args){

        //��������
        String [] names;
        int[] scores;
        //��ʼ��
        //��һ��:��̬��ʼ��
        names =new String[]{"liu","wang","li"};
        //�ڶ��֣���̬��ʼ��
        scores =new int[4];
        scores[0]=1;
        scores[1]=2;
        scores[2]=3;
        //scores[3]=4;
        //����ĳ��ȣ�ͨ��length����
        System.out.println(names.length);
        System.out.println(scores.length);
        //��������Ԫ��
        for(int i = 0;i < names.length;i++ ){
            System.out.println(names[i]);
        }
        for(int i = 0;i < 4;i++ ){
            System.out.println(scores[i]);
        }


    };
}
