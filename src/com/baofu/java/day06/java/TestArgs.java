package com.baofu.java.day06.java;

/**
 * Created by BF100427 on 2020/6/2.
 */
public class TestArgs {
    public static void main(String[] args){
        TestArgs t=new TestArgs();
        t.sayHello();
        t.sayHello("a","b");

    }

    public void sayHello(){
        System.out.println("hello world");
    }
    public void sayHello(String str1){
        System.out.println("hello world"+str1);
    }
    public void sayHello(String... str2){
        for(int i=0;i<str2.length;i++){
            System.out.println(str2[i]);
        }
    }
}
