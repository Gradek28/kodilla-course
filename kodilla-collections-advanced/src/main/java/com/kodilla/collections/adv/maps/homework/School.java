package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> school = new ArrayList<>();

    public School(Integer... school) {
        for (Integer quantity : school)
            this.school.add(quantity);

    }
    @Override
    public String toString() {
        return "School" + school.toString();
    }

    public int getAverage() {
        int sum = 0;
        for (int quantity : school)
            sum += quantity;
        return sum;

    }
}
