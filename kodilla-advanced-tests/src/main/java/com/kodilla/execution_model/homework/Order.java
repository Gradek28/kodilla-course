package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Order {
    //wartość zamowienia
    //data
    //login
    private double orderValue;
    private LocalDate orderDate;
    private String purchaser;

    public Order(double orderValue, LocalDate orderDate, String purchaser){
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.purchaser = purchaser;
    }
    public double getOrderValue(){
        return orderValue;
    }
    public LocalDate getOrderDate(){
        return orderDate;
    }
    public String getPurchaser(){
        return purchaser;
    }
    @Override
    public boolean equals(Object o) {       //porownanie obiektow klasy
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(getOrderValue(), order.getOrderValue()) == 0 &&
                orderDate.equals(order.getOrderDate()) &&
                purchaser.equals(order.purchaser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, orderDate, purchaser);
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                ", purchaser='" + purchaser + '\'' +
                '}';
    }
}

