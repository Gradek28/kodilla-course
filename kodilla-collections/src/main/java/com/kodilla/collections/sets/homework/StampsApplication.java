package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("beach", 2, true));
        stamps.add(new Stamp("desert", 4, true));
        stamps.add(new Stamp("diamond", 3, false));
        stamps.add(new Stamp("rose", 4, true));
        stamps.add(new Stamp("rose", 4, true));
        stamps.add(new Stamp("diamond", 3, false));
        stamps.add(new Stamp("beach", 2, true));
        stamps.add(new Stamp("desert", 4, true));
        stamps.add(new Stamp("diamond", 3, false));
        stamps.add(new Stamp("rose", 4, true));
        stamps.add(new Stamp("rose", 4, true));
        stamps.add(new Stamp("diamond", 3, false));


        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
