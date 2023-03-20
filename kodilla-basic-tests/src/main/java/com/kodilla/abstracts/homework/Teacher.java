package com.kodilla.abstracts.homework;
public class Teacher extends Job {



    public Teacher(String responsibilities, double salary, String job) {
        super("check homework, insert grades, teach", 2500,"Teacher");
        System.out.println("Alan is a " + job +  " Teacher duties include: "  +  responsibilities  + " Teacher earns " + salary);
    }


}
