package com.baofu.java.day09.exerce.baseclass;

/**
 * Created by BF100427 on 2020/6/12.
 */
public class Order {
    private int orderId;
    private String orderName;
    public Order(String orderName,int orderId){
        this.orderName = orderName;
        this.orderId =orderId;
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
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//        if(obj instanceof Order){
//            Order o =(Order)obj;
//            return this.orderId == o.orderId && this.orderName.equals(o.orderName);
//        }else{
//            return false;
//        }
//    }



}
