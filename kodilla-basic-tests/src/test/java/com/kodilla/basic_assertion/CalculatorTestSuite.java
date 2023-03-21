package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
        double sumResult = calculator.sum(a, b);
        assertEquals(11.4, sumResult, 0.3333);
    }
    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
        double substractResult = calculator.subtract(a, b);
        assertEquals(-0.2, substractResult, 0.3333);
    }
    @Test
    public void powerResult(){
        Calculator calculator = new Calculator();
        int a = -5;
        int b = 2;
        double powerResult = Math.pow(a , b);
        assertEquals(25, powerResult, 0.3333);
    }
}
