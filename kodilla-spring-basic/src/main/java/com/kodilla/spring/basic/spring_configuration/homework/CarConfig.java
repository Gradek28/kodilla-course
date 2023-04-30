package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

@Configuration
public class CarConfig {

    @Bean
    public Car car(){
        LocalTime now = LocalTime.now();
        Month month = LocalDate.now().getMonth();
        boolean headlightsOn = (now.isAfter(LocalTime.of(20,0)) || now.isBefore(LocalTime.of(6,0)));
        if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY) {
            return new SUV(headlightsOn, "SUV");
        }else if (month == Month.MARCH || month == Month.APRIL || month == Month.MAY) {
            return new Sedan(headlightsOn, "Sedan");
        }else {
            return new Cabrio(headlightsOn, "Cabrio");
        }
    }
}
