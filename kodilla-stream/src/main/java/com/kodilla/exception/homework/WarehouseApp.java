package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("131/22/33"));
        warehouse.addOrder(new Order("132/22/33"));
        warehouse.addOrder(new Order("133/22/33"));
        warehouse.addOrder(new Order("134/22/33"));
        warehouse.addOrder(new Order("135/22/33"));
        System.out.println(warehouse);

        String orderNumber = "130/22/33";

        try {
            Order order= warehouse.getOrder(orderNumber);
            System.out.println("Order number: " + orderNumber + "is present");
        }catch (OrderDoesntExistException e){
            System.out.println("Order number doesn't exi.: " + orderNumber);
        }finally {
            System.out.println("Thank you for Your Order");
        }
        }


}
