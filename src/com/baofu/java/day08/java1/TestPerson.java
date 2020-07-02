package com.baofu.java.day08.java1;

/**
 * Created by BF100427 on 2020/6/10.
 */
public class TestPerson {
    public static void main(String[] args){
        Person p =new Person();
        p.eat();

        Man m = new Man();
        m.eat();

        Person p1 =new Man();//向上转型
        Person p2 =new Woman();
//        p1.eat();
//        p1.setIsSmoking//无法直接调用man的方法,可以使用强制类型转换，转换成Man，向下转型
//        Man m1 =(Man)p1;//向下转型
//        m1.setIsSmoking(true);
        if(p2 instanceof Woman){
            Woman w =(Woman)p2;
            w.eat();
        }
        if (p2 instanceof Man){
            Man m1 = (Man)p2;
            m1.eat();
        }




    }
}
