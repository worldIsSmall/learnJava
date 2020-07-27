package com.baofu.java.day12;

/**
 * Created by BF100427 on 2020/7/23.
 * 如何自定义异常类
 * 1 继承现在有异常类
 * 2 提供一个序列号，提供重载构造器
 */
public class MyException extends Exception{
    static final long serialVersionUID = -7034897190745766939L;
    public MyException(){

    }
    public MyException(String message){
        super(message);
    }

}
