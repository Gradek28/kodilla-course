package com.kodilla.abstracts.homework;

public class Teacher extends Job {



    public Teacher(String responsibilities, double salary) {
        super("check homework, insert grades, teach", 2500);
        System.out.println("Teacher duties include" + responsibilities);
    }


}

