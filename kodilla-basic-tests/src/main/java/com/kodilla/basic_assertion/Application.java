package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
        double sumResult = calculator.sum(a , b );
        boolean correct = ResultChecker.assertEquals(13, sumResult, 0.3333);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double subtractResult = calculator.subtract(a , b);
        correct = ResultChecker.assertEquals(-3, subtractResult, 0.3333);
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        }else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);

        }
        double powerResult = calculator.pow(a , b );
        correct = ResultChecker.assertEquals(390625 , powerResult, 0.3333 );
        if (correct) {
            System.out.println("Metoda power działa poprawnie dla liczb " + a + " i " + b);
        }else {
            System.out.println("Metoda power nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
