package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> school = new ArrayList<>();

    public School(Double... school) {
        for (Double quantity : school)
            this.school.add(quantity);

    }
    @Override
    public String toString() {
        return "School" + school.toString();
    }

    public double getAverage() {
        double sum = 0.0;
        for (double quantity : school)
            sum += quantity;
        return sum;

    }
}
