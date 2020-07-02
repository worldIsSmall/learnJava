package com.baofu.java.day04;

/**
 * ���ڻ����������ͣ�byte,short,int,long,boolean,float,double,char
 * ����byte��short��long��int���ԣ���������Ĭ��ֵΪ0
 * ���ڣ�boolean,Ĭ��fales
 * ���ڣ�float,double���ԣ�Ĭ��0.0
 * ����char,Ĭ�Ͽո�
 * ���ڣ��������ͱ������ɵ����飬Ĭ�ϳ�ʼ��ֵΪnull����StringΪ��
 * Created by BF100427 on 2020/5/19.
 */
public class TestArray {
    public static void main(String[] args){
        String[] str=new String[4];
        str[0]="AA";
        str[1]="BB";
        str[2]="CC";
        str[3]="DD";
        for (int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
        float[] f=new float[3];
        f[0]=1.2f;
        for (int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }
        char[] c=new char[2];
        c[0]='a';
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }

        boolean[] b=new boolean[2];
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        Person[] per=new Person[3];
        for(int i=0;i<per.length;i++){
            System.out.println(per[i]);
        }
    }
}

class Person{

}
