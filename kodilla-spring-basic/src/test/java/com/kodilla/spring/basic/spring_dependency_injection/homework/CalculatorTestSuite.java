package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




@SpringBootApplication
public class CalculatorTestSuite {




    @Test
    public void testAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.add(2,3);
        Assertions.assertEquals(5,result);
        // oczekujemy, że pojawi się "5.0"
    }

    @Test
    public void testSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.subtract(5,2);
        Assertions.assertEquals(3, result);
        // oczekujemy, że pojawi się "3.0"
    }

    @Test
    public void testMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.multiply(3, 4);
        Assertions.assertEquals(12, result);
        // oczekujemy, że pojawi się "12.0"
    }

    @Test
    public void testDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.divide(10, 2);
        Assertions.assertEquals(5, result);
        // oczekujemy, że pojawi się "5.0"
    }

    @Test
    public void testDivideByZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.divide(5, 0);
        Assertions.assertEquals(Double.NaN, result);
        // oczekujemy, że pojawi się "Nie można dzielić przez zero!"
    }

    @Test
    public void testDisplay() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Display.class);
        Display displayBean = context.getBean(Display.class);
        displayBean.display(5);
        // oczekujemy, że pojawi się "5.0"
    }
    }

