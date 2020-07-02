package com.baofu.java.day09.java;

import org.junit.Test;

/**
 * Created by BF100427 on 2020/6/13.
 */
public class TestWrapper {
    //基本数据类型，包装类和String类之间的转化
    @Test
    public void test2(){
        String str =String.valueOf(12);
        String str1 =String.valueOf(true);
        int i =Integer.parseInt(str);
        boolean b =Boolean.parseBoolean(str1);


    }

    //基本数据类型和包装类的转化
    @Test
    public void test1() {
        int i = 10;
//        System.out.println(i.toString);不合法
        boolean b = false;
        Integer i1 = new Integer(i);
        System.out.println(i1.toString());

//        Float f = new Float("aa");转换报异常java.lang.NumberFormatException: For input string: "aa"
        Float f = new Float("12.3F");
        System.out.println(f + i);
        Boolean b1 = new Boolean(true);
        System.out.println(b1);

        b1 = new Boolean("true111");//对于boolean 当形参是true，返回true,其他返回false
        System.out.println(b1);
        Order o =new Order();
        System.out.println("o调用b:"+o.b);

        //包装类转化成基本数据类型
        int i2 =i1.intValue();
        System.out.println("I2:"+i2);
        boolean b3 =o.b.booleanValue();
        System.out.println("b转化基本数据类型:"+b3);

        //JDK5.O以后 自动装箱，拆箱
        Integer i4 =12;
        int i5 =i4;

    }

}
class Order{
    Boolean b;
}
