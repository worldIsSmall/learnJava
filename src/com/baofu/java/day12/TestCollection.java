package com.baofu.java.day12;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by BF100427 on 2020/7/28.
 */
public class TestCollection {
    @Test
    public void testCollection3(){
        Collection coll = new ArrayList<>();
        coll.add(123);
        coll.add("AA");
        coll.add(new Date());
        coll.add("BB");
        coll.add(new Person("aa",23));

        Collection coll1 =new ArrayList<>();
        coll1.add(new String("AA"));
        coll1.add(123);
        //10.removeAll（Collection coll） 删除当前集合中，与coll共有的元素
        coll.removeAll(coll1);
        System.out.println(coll);
        //11 equals(Object obj)判断集合中的所有元素是否完全相同,集合也是有顺序的
        Collection coll2 =new ArrayList<>();
        coll2.add(new String("AA"));
        coll2.add(123);
        System.out.println(coll1.equals(coll2));
        //12 hashCode()计算哈希值
        System.out.println(coll.hashCode());
        //13 toArray() :将集合转化为数组
        Object[] obj = coll.toArray();
        for (int i =0; i < obj.length;i++){
            System.out.println(obj[i]);
        }
        System.out.println();
        //14 iterator() :返回一个Iterator接口实现类的对象
        Iterator iterator = coll.iterator();
        //遍历集合
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
    @Test
    public void testCollection2(){
        Collection coll = new ArrayList<>();
        coll.add(123);
        coll.add("AA");
        coll.add(new Date());
        coll.add("BB");
        coll.add(new Person("aa",23));
        //6.contains(Object obj)包含集合中是否包含指定的obj元素，包含，返回true,反之返回false
        //判断的依据，根据元素所造类的equals（）方法进行判断
        //明确，如果存入集合中的元素是自定义的队形，要求，自定义类要重写equals方法
        boolean b1 =coll.contains("AA");
        System.out.println(b1);
        b1 = coll.contains(1);
        System.out.println(b1);
        System.out.println(coll.contains(new Person("aa",23)));
        //7.containsAll(Collection coll);判断当前集合中是否包含coll中所有元素
        Collection coll1 =new ArrayList<>();
        coll1.add(new String("AA"));
        coll1.add(123);
        System.out.println("#"+coll.containsAll(coll1));
        System.out.println("%"+coll1.containsAll(coll));
        //8.retainAll(Collection coll)求当前集合与coll的共有元素，返回给当前集合
        coll.retainAll(coll1);
        System.out.println(coll);
        //9.remove(Object obj)删除集合中obj元素，删除成功返回true,否则返回false
        System.out.println(coll.remove("bb"));
        System.out.println(coll.remove(new String("AA")));




    }
    @Test
    public void testCollection(){
        Collection coll = new ArrayList<>();
        //1.size();返回集合中元素的个数
        System.out.println(coll.size());
        //2.add(Object obj)向几个中添加一个元素
        coll.add(123);
        coll.add("AA");
        coll.add(new Date());
        coll.add("BB");
        System.out.println(coll.size());
        // 3.addAll(Collection coll)将形参coll中包含的所有元素添加到当前集合中
        Collection coll1 = Arrays.asList(1,2,"aa");
        coll.addAll(coll1);
        System.out.println(coll.size());
        //查看集合的元素
        System.out.println(coll);
        //4.isEmpty()判断集合是否为空
        System.out.println(coll.isEmpty());
        //5.clear() 清空集合中的元素
        coll.clear();
        System.out.println(coll.isEmpty());
    }
}
