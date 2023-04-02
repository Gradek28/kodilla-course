package com.kodilla.collections.adv.immutable.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFindFlightsFrom() {
        assertEquals(1, flightFinder.findFlightsFrom("Warsaw").size());
    }

    @Test
    public void testFindFlightTo() {
        assertEquals(1, flightFinder.findFlightTo("Oslo").size());
    }

}