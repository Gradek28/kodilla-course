package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootApplication
public class CarConfigTestSuite {

    @Test
    public void shouldReturnSuvInWinter() {
        LocalTime nightTime = LocalTime.of(23,00);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = context.getBean(Car.class);
        boolean hasHeadlightsTurnedOn = car.hasHeadlightsTurnedOn(nightTime);
        assertTrue(hasHeadlightsTurnedOn);


    }

    @Test
    public void shouldReturnSedanInSpring() {
        LocalTime dayTime = LocalTime.of(12,00);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = context.getBean(Car.class);
        boolean hasHeadlightsTurnedOn = car.hasHeadlightsTurnedOn(dayTime);
        assertTrue(hasHeadlightsTurnedOn);

    }

    @Test
    public void shouldReturnCabrioInSummer() {
        LocalTime dayTime = LocalTime.of(11, 0);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = context.getBean(Car.class);
        boolean hasHeadlightsTurnedOn = car.hasHeadlightsTurnedOn(dayTime);
        assertTrue(hasHeadlightsTurnedOn);
    }

    @Test
    public void shouldTurnOnHeadlightsInEarlyMorning() {

        LocalTime earlyMorningTime = LocalTime.of(5, 30);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = context.getBean(Car.class);
        boolean hasHeadlightsTurnedOn = car.hasHeadlightsTurnedOn(earlyMorningTime);
        assertTrue(hasHeadlightsTurnedOn);
    }


}
