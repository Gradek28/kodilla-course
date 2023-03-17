package com.kodilla.abstracts.homework;

public class Soldier extends Job{


    public Soldier(String responsibilities, double salary) {
        super("shoot too enemy, defend the country", 5000);
        System.out.println("Soldier duties include" + responsibilities);
    }


}

