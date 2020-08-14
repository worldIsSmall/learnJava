package com.baofu.java.day13;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by BF100427 on 2020/8/14.
 */
public class TestMap {
    @Test
    public void test1(){
        Map map =new HashMap();
        map.put("AA",123);
        map.put("BB",65423);
        map.put("BB",123);
        map.put("123","xx");
        map.put(null,null);
        System.out.println(map.size());

    }

}
