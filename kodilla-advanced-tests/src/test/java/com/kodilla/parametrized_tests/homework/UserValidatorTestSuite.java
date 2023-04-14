package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aga" , "abc1-" , "-AbC_" , "_-ABC" , ".ag" , "._-" , "...." , "---"})
    public void shouldReturnTrueWhenUsernameIsCorrect(String Username){
        assertTrue(userValidator.validateUsername(Username));
    }
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"ab" , ".." , "age$-." , ".." , "" ,})
    public void shouldReturnFalseWhenUsernameIsNotCorrect(String Username){
        assertFalse(userValidator.validateUsername(Username));
    }
    @ParameterizedTest
    @ValueSource(strings = {"test.email@example.pl" , "test.emailtest@exaple.com" , "test-email@example-domain.com" , "TEST.Email@example.au"})
    public void shouldReturnTrueWhenEmailIsCorrect(String email){
        assertTrue(userValidator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"null" , ".." , "test.email@" , "@example.pl" , "test.example@" , "test.email@-example+" })
    public void shouldReturnFalseWhenEmailIsNotCorrect(String email){
        assertFalse(userValidator.validateEmail(email));
    }
}
