package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManipulatorTestSuite {

    private StringManipulator manipulator = new StringManipulator();

    private static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }


    @ParameterizedTest
    @CsvSource(value = {"test,tset", "OtHer,rehto", "EVent,tneve"})
    public void shouldReverseStringWithLowercase(String input, String expected){
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test,4","OTher,5", "E v e n t,5", "null ,4"})
    public void shouldGetStringLengthWithoutSpaces(String input, int expected){
        System.out.println("|" + input + "| ," + manipulator.getStringLengthWithoutSpaces(input));
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @MethodSource(value = "provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "..OtHer :0","E,v,e,n,t:4","null :0"}, delimiter = ':')
    public void shouldCountNumberOfCommas(String input, int expected){
        assertEquals(expected, manipulator.countNumberOfCommas(input));
    }
}