package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ShippingCenterTestSuite {
    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldReturnSuccessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter shippingCenterBean = context.getBean(ShippingCenter.class);
        String message = shippingCenterBean.sendPackage("Gorzow, ul. Jagielly 5", 25);
        Assertions.assertEquals("Package delivered to: Gorzow, ul. Jagielly 5", message);
    }

    @Test
    public void shouldReturnFailMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter shippingCenterBean = context.getBean(ShippingCenter.class);
        String message = shippingCenterBean.sendPackage("Gorzow, ul. Jagielly 5", 35);
        Assertions.assertEquals("Package not delivered to: Gorzow, ul. Jagielly 5", message);
    }
}
