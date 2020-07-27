package com.baofu.java.day12.exercise;

/**
 * Created by BF100427 on 2020/7/27.
 */
public class EcDef extends Exception{
    static final long serialVersionUID = -7034897190745766939L;

    public EcDef() {
    }
    public EcDef(String message) {
        super(message);
    }

}
