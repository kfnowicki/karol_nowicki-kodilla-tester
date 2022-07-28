package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a,b);
        int subtractResult = calculator.subtract(a,b);
        int powerResult = calculator.power(a);
        boolean correct = ResultChecker.assertEquals(13,sumResult);

        if (correct) {
            System.out.println("Add is correct for: " + a + " and " + b);
        } else {
            System.out.println("Add is incorrect for: " + a + " and " + b);
        }

        correct = ResultChecker.assertEquals(-3,subtractResult);
        if (correct) {
            System.out.println("Subtract is correct for: " + a + " and " + b);
        } else {
            System.out.println("Subtract is incorrect for: " + a + " and " + b);
        }

        correct = ResultChecker.assertEquals(25,powerResult);
        if (correct) {
            System.out.println("Power is correct for: " + a);
        } else {
            System.out.println("Power is incorrect for: " + a);
        }
    }
}
