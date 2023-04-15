package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {
    private static final String EXPECTED_MESSAGE_EXCEPTION = "Wrong numbers provided";
    GamblingMachine gamblingMachine = new GamblingMachine();
    Set<Integer> userNumbers = new HashSet<>();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", delimiter = '\n')
    public void shouldThrowExceptionWhenNumbersIsInvalid(String numbers) {
        Set<Integer> setOfNumbers = Arrays.stream(numbers.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(setOfNumbers));
        assertEquals(EXPECTED_MESSAGE_EXCEPTION, exception.getMessage());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/isNotCorrectNuberSizeSix.csv", delimiter = '\n')
    public void shouldThrowExceptionWhenSizeIsCorrectButNumbersAreOutOfScope(String number) {
        Set<Integer> setOfNumbers = Arrays.stream(number.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(setOfNumbers));
        assertEquals(EXPECTED_MESSAGE_EXCEPTION, exception.getMessage());

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", delimiter = '\n')
    public void shouldReturnValueBetweenZeroAndSix(String numbers) throws InvalidNumbersException {
        Set<Integer> setOfNumbers = Arrays.stream(numbers.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        System.out.println(setOfNumbers);
        int result = gamblingMachine.howManyWins(setOfNumbers);
        System.out.println(result);
        assertTrue(result >= 0 && result <= 6);


    }
}
