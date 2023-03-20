package com.kodilla.abstracts.homework;


    public class Soldier extends Job{


        public Soldier(String responsibilities, double salary, String job) {
            super("shoot too enemy, defend the country", 5000, "Soldier");
            System.out.println("Matt is a.. "  + job   +  " He duties include: "  + responsibilities  + " Soldier earns "  + salary);
            
        }


    }

