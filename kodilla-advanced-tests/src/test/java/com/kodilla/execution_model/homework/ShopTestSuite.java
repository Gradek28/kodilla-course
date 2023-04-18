package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ValueRange;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShopTestSuite {
        Shop shop = new Shop();
        Order order1 = new Order(50.0, LocalDate.of(2010, 3, 1), "user1");
        Order order2 = new Order(100.0, LocalDate.of(2012, 3, 2), "user2");
        Order order3 = new Order(200.0, LocalDate.of(2014, 3, 3), "user3");
        Order order4 = new Order(300.0, LocalDate.of(2016, 3, 4), "user4");
        Order order5 = new Order(400.0, LocalDate.of(2018, 3, 5), "user5");
        Order order6 = new Order(500.0, LocalDate.of(2020, 3, 6), "user6");

        @Test
        public void testAddNewOrder() {
            Order newOrder = new Order(600.0, LocalDate.of(2023, 4, 1), "user7");
            shop.addOrder(newOrder);
            Assertions.assertEquals(7, shop.getOrderCount());
        }

        @Test
        public void testGetOrdersBetweenDates() {
            LocalDate startDate = LocalDate.of(2010, 3, 1);
            LocalDate endDate = LocalDate.of(2016, 3, 4);
            List<Order> orders = shop.getOrdersBetweenDates(startDate, endDate);
            Assertions.assertEquals(2, orders.size());
            assertTrue(orders.contains(order2));
            assertTrue(orders.contains(order3));
        }

        @Test
        public void testGetOrdersByValueRange() {
            double minValue = 150.0;
            double maxValue = 350.0;
            Set<Order> orders = shop.getOrdersByValueRange(minValue, maxValue);
            assertEquals(2, orders.size());
            assertTrue(orders.contains(order3));
            assertTrue(orders.contains(order4));
        }

        @Test
        public void testGetOrderCount() {
            assertEquals(6, shop.getOrderCount());
        }

        @Test
        public void testGetTotalOrderValue() {
            double expectedTotal = 1550.0;
            assertEquals(expectedTotal, shop.getTotalOrderValue(), 0.001);
        }
        @BeforeEach
        void initializeShop(){
            shop.addOrder(order1);
            shop.addOrder(order2);
            shop.addOrder(order3);
            shop.addOrder(order4);
            shop.addOrder(order5);
            shop.addOrder(order6);
        }

    }







