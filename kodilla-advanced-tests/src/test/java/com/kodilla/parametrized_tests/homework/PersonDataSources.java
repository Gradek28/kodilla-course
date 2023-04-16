package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonDataSources {
     static Stream<Arguments> providePersonDataBmiForTest(){
        return Stream.of(
                Arguments.of(1.7, 40, "Very severely underweight"),
                Arguments.of(1.7, 45, "Severely underweight"),
                Arguments.of(1.7, 51, "Underweight"),
                Arguments.of(1.7, 62, "Normal (healthy weight)"),
                Arguments.of(1.7, 81, "Overweight"),
                Arguments.of(1.7, 97, "Obese Class I (Moderately obese)"),
                Arguments.of(1.7, 111, "Obese Class II (Severely obese)"),
                Arguments.of(1.7, 129, "Obese Class III (Very severely obese)"),
                Arguments.of(1.7, 131, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.7, 162, "Obese Class V (Super Obese)"),
                Arguments.of(1.7, 194, "Obese Class VI (Hyper Obese)")
        );
     }
}
