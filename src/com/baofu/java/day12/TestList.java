package com.baofu.java.day12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by BF100427 on 2020/7/30.
 */
public class TestList {
    /*
    * ArrayList,list（是Collection的子接口）的主要实现类
    * List中相对于Collection，新增加的方法
    * void add(int index, Object ele) 指定的索引位置添加元素ele
      boolean addAll(int index, Collection eles)，在指定索引位置添加元素
      Object get(int index)获取指定索引的元素
      int indexOf(Object obj) 返回obj在集合中首次出现的位置，如果没有的话，返回-1
      int lastIndexOf(Object obj)返回obj在集合中最后一次出现的位置，如果没有的话，返回-1
      Object remove(int index) 删除指定索引位置的元素,并返回
      Object set(int index, Object ele) 设置指定索引的元素为ele
      List subList(int fromIndex, int toIndex)返回从fromIndex开始，toIndex结束的左闭右开的一个子list

      List常用的方法 增（add（Object obj）） ,删（remove）,改（set(int dex,Object obj)）,查（get）
    *
    */
    @Test
    public void testList2(){
        List list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(new String("aa"));
        list.add(new String("bb"));
        list.add(345);
        System.out.println(list.indexOf(345));
        System.out.println(list.lastIndexOf(345));
        System.out.println(list.indexOf(444));
        System.out.println();
        System.out.println(list.subList(1,3));
    }
    @Test
    public void testList1() {
        List list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(new String("aa"));
        list.add(new String("bb"));
        System.out.println(list);
        list.add(0,555);
        System.out.println(list);
        Object object =list.get(2);
        System.out.println(object);
        System.out.println(list.remove(1));
        System.out.println(list);
        list.set(1,"aad");
        System.out.println(list);
    }
}
