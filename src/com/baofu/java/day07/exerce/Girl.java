package com.baofu.java.day07.exerce;

/**
 * Created by BF100427 on 2020/6/6.
 * import:
 * 1)显示导入指定包下的类或接口
 * 2)写在包的声明和源文件之间
 * 3）如果引入多个类或者接口，并列写出
 * 4）如果是jav.lang包下面的，如System,String,Math等，不需要显示
 * 5）理解.*概念
 * 6）如何处理同名类的导入，如，在util,和SQL下同时存在Date类，一个用包引入，另个一个，java.sql.Date，直接指明类的位置
 * 7） import static 表示导入指定的类的属性和方法
 *
 */
public class Girl {
    private String name;
    public Girl(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void marry(Boy boy){
        System.out.println("我要嫁给"+boy.getName());
        boy.marry(this);
    }


}
