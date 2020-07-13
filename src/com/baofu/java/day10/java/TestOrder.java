package com.baofu.java.day10.java;

/**
 * Created by BF100427 on 2020/7/8.
 */
public class TestOrder {
    public static void main(String[] args) {
        Order o1 =new Order(1003,"BB");
        System.out.println(o1);

        Order o2 =new Order();
        System.out.println(o2);
    }
}

class Order{
    private  int orderId =1001;
    private String orderName;

    //非静态初始化块
    {
        orderId =1002;
        orderName= "AA";
        System.out.println("我是代码块1");
    }
    //静态初始化块

    static{
        System.out.println("静态代码块1");
    }
    static{
        System.out.println("静态代码块2");
    }

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }

}
