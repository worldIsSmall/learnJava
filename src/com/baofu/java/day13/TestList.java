package com.baofu.java.day13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by BF100427 on 2020/8/4.
 */
public class TestList {
    @Test
    public void testList(){
//        ArrayList list = new ArrayList();
        LinkedList list = new LinkedList();
        list.add(22);
        list.add(new String("aa"));
        list.add(34);
        list.add("jj");

        list.add(0,11);
        System.out.println(list);

        for (Object obj:list){
            System.out.println(obj);
        }
        System.out.println();
        Iterator i =list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
