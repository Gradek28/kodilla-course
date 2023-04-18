package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop {
    private Set<Order> orders;

    Shop() {
        orders = new HashSet<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersBetweenDates(LocalDate startDate, LocalDate endDate) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getOrderDate().isAfter(startDate) && order.getOrderDate().isBefore(endDate)) {
                result.add(order);
            }
        }
        return result;
    }

    public Set<Order> getOrdersByValueRange(double minValue, double maxValue) {
        Set<Order> result = new HashSet<>();
        for (Order order : orders) {
            if (order.getOrderValue() >= minValue && order.getOrderValue() <= maxValue) {
                result.add(order);
            }
        }
        return result;
    }

    public int getOrderCount() {
        return orders.size();
    }

    public double getTotalOrderValue() {
        double total = 0;
        for (Order order : orders) {
            total += order.getOrderValue();
        }
        return total;
    }
}

