package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 5;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-1, subtractResult);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        int a = 4;
        int powerResult = calculator.power(a);
        assertEquals(16, powerResult,0.000001); //added this way just to test, since Calculator power was based on "dwie liczby całkowite", int would be enough?
    }
}
