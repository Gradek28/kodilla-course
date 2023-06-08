package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {
    @Test
    void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy4() {
        // Given
        Year year = new Year(2019);

        // When
        boolean isLeapYear = year.isLeap();

        // Then
        assertFalse(isLeapYear);

    }
    @Test
    void shouldNotBeLeapYearIfDivisibleBy100ButNotBy400() {
        // Given
        Year year = new Year(1700);

        // When
        boolean isLeapYear = year.isLeap();

        // Then
        assertFalse(isLeapYear);
    }
    @Test
    void shouldBeLeapYearIfDivisibleBy4ButNotBy100() {
        // Given
        Year year = new Year(2020);

        // When
        boolean isLeapYear = year.isLeap();

        // Then
        assertTrue(isLeapYear);
    }
}
