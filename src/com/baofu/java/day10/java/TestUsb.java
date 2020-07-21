package com.baofu.java.day10.java;

/**
 * Created by BF100427 on 2020/7/13.
 */
public class TestUsb {
    public static void main(String[] args) {
        Computer computer =new Computer();
        computer.doWork(new Printer());

        Flash f = new Flash();
        computer.doWork(f);
        //实现接口的匿名类对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始连接");
            }

            @Override
            public void stop() {
                System.out.println("手机停止连接");
            }
        };
        computer.doWork(phone);
    }
}

interface USB{
    String name="hao";
    void start();
    void stop();
}

class Computer{
    public void doWork(USB usb){
        usb.start();
        System.out.println("此设备开始工作");
        usb.stop();
    }
}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}

class Flash implements USB{
    public void start(){
        System.out.println("U盘开始工作");
    }
    public void stop(){
        System.out.println("U盘停止工作");
    }
}