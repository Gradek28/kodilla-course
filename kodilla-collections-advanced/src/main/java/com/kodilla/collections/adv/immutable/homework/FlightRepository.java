package com.kodilla.collections.adv.immutable.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Oslo"));
        flights.add(new Flight("Berlin", "London"));
        flights.add(new Flight("Poznan", "Roma"));
        flights.add(new Flight("Paris","New York"));
        return flights;
    }
}
