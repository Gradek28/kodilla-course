package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {
    @ParameterizedTest
    @MethodSource("com.kodilla.parametrized_tests.homework.PersonDataSources#providePersonDataBmiForTest")
    public void testGetBMI(double height, double weight, String expectedBMI) {
        Person person = new Person(height, weight);
        assertEquals(expectedBMI, person.getBMI());
    }


}
