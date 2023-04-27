package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService() {
            @Override
            public boolean deliverPackage(String address, double weight) {
                if (weight > 30) {
                    System.out.println("Package too heavy");
                    return false;
                }
                System.out.println("Delivering in progress...");
                return true;
            }
        };

        NotificationService notificationService = new NotificationService() {
            @Override
            public void success(String address) {
                System.out.println("Package delivered to: " + address);
            }

            @Override
            public void fail(String address) {
                System.out.println("Package not delivered to: " + address);
            }
        };

        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York",  18.2);
    }
}