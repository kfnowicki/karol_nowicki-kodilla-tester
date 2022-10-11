package com.kodilla.parametrized_tests;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidatorTestSuite {
    StringValidator stringValidator =  new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"","   "})
    void shouldReturnTrueIfStringIsEmpty(String text){
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnTrueIfStringIsNull(String text){
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @EmptySource
    void shouldReturnTrueIfStringIsEmptySource(String text){
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnTrueIfStringIsNullAndEmpty(String text){
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmptyDisplay(String text) {
        System.out.println("|" + text + "|");
        assertTrue(stringValidator.isBlank(text));
    }
}