package com.kodilla.basic_assertion;

import java.math.BigDecimal;

public class ResultChecker {

    public static final double DELTA = 0.3333;

    public static boolean assertEquals(double expected , double actual, double delta){
        return expected == actual;
            }
}
