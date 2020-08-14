package com.baofu.java.day13;

import org.junit.Test;

import java.util.*;

/**
 * Created by BF100427 on 2020/8/6.
 */
public class TestSet {
    /*
    * Set:储存是无序的，不可重复的
    * 1 无序性：不代表随机性，指的是在底层储存位置是无序的
    * 2 不可重复：
    *
    * 说明：要求添加进set中的元素所在类，一定要重写equals()和hashCode()方法
    */
    @Test
    public void testTreeSet2(){
        //1 创建一个实现了Comparaotr接口的类对象
        Comparator com =new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

    }
    @Test
    /*TreeSet
    1 添加的元素必须是同一个类的
    2 可以按照添加集合中的元素的指定顺序遍历，像String，从小到大排序遍历
    3 当向TreeSet中添加自定义类的时候，有两种排序方式1.自然排序2.定制排序
    4 自然排序，定义类中实现java.lang.Comparable,并重写，ComparaTo().在此方法中定义根据哪个属性排序
    5 向TreeSet中添加元素时，首先按照comparaTo()进行比较，一旦返回0，虽然仅是两个对象的属性值相同
    但程序会认为是两个对象相同，进而后一个对象就不能添加进来
    * */
    public void testTreeSet1(){
        Set set =new TreeSet<>();
//        set.add(123);
//        set.add(456);
//        set.add(123);
//        set.add("AA");
//        set.add("bb");
//        set.add("AA");
//        set.add("JJ");
//        set.add("GG");
//        set.add("MM");
//        set.add("BB");
        //当Person类没有实现Comparable接口时，当向TreeSet中添加Person对象，报错ClassCastException
        set.add(new Person("bb",23));
        set.add(new Person("AA",23));
        set.add(new Person("BB",24));
        set.add(new Person("AA",43));
        set.add(new Person("rr",34));
        Iterator i =set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
    @Test
    public void testHashSet(){
        Set set =new HashSet<>();
        set.add(123);
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("bb");
        set.add(null);
        Person p1 = new Person("gg",23);
        Person p2 = new Person("gg",23);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        set.add(p1);
        set.add(p2);
        System.out.println(set.size());
        System.out.println(set);

        Iterator i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println();
        for (Object obj :set){
            System.out.println(obj);
        }
    }
}
