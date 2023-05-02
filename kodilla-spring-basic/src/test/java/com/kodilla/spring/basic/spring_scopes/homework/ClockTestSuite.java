package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
@SpringBootApplication
public class ClockTestSuite {
    @Test
    public void testDifferentTimes() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);
        Clock clock3 = context.getBean(Clock.class);
        LocalTime time1 = clock1.getTime();
        LocalTime time2 = clock2.getTime();
        LocalTime time3 = clock3.getTime();
        assertNotEquals(time1, time2);
        assertNotEquals(time1, time3);
        assertNotEquals(time2, time3);

    }

    @Test
    public void testReturnDifferentTimes() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");
        Clock clock1 = context.getBean(Clock.class);
        System.out.println(clock1.getTime());
        TimeUnit.SECONDS.sleep(10);
        Clock clock2 = context.getBean(Clock.class);
        System.out.println(clock2.getTime());
        TimeUnit.SECONDS.sleep(10);
        Clock clock3 = context.getBean(Clock.class);
        System.out.println(clock3.getTime());
        TimeUnit.SECONDS.sleep(10);

        assertNotEquals(clock1.getTime(), clock2.getTime());
        assertNotEquals(clock1.getTime(), clock3.getTime());
        assertNotEquals(clock2.getTime(), clock3.getTime());


    }


}
