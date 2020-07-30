package com.baofu.java.day12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by BF100427 on 2020/7/30.
 */
public class TestIterator {
    //使用增强for循环实现数组的遍历
    @Test
    public void testFor1(){
        int[] i =new int[]{1,2,4};
        for (int j : i){
            System.out.println(j);
        }
    }

    //使用增强for循环实现集合的遍历
    @Test
    public void testFor(){
        Collection coll = new ArrayList<>();
        coll.add(123);
        coll.add("AA");
        coll.add(new Date());
        coll.add("BB");
        coll.add(new Person("aa",23));

        for (Object i:coll){
            System.out.println(i);
        }
    }
    //使用迭代器实现集合的遍历
    @Test
    public void test1(){
        Collection coll = new ArrayList<>();
        coll.add(123);
        coll.add("AA");
        coll.add(new Date());
        coll.add("BB");
        coll.add(new Person("aa",23));

        Iterator i = coll.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
