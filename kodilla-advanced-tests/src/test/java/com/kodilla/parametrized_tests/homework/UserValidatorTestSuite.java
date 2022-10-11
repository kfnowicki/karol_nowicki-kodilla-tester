package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings ={"Eren","ErenJaeger","erEn","Eren123","Eren_Jaeger","Eren.Jager_12.3", "123", "E123"})
    void shouldReturnTrueIfValidUsername(String input) {
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnFalseIfNullAndEmptyUsername(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "k", "K", "Ka","ka"})
    void shouldReturnFalseIfUsernameTooShort(String username){
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnFalseIfNullEmail(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    void shouldReturnTrueIfEmptyEmail(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings ={"eren@attack.com","ErenJaeger@attackOnTitan.com","erEn@anime.com","Eren123@anime-123.pl","Eren_Jaeger@123.com","Eren.Jager_12.3@123-st.com"})
    void shouldReturnTrueIfValidEmail(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

}