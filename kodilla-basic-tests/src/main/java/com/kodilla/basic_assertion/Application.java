package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a , b );
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a , b);
        correct = ResultChecker.assertEquals(-3, subtractResult);
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        }else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);

        }
        double powerResult = calculator.pow(a , b);
        correct = ResultChecker.assertEquals(390625 , powerResult );
        if (correct) {
            System.out.println("Metoda power działa poprawnie dla liczb " + a + " i " + b);
        }else {
            System.out.println("Metoda power nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
