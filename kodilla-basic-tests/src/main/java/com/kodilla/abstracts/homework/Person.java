package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private String job;

    public Person(String firstName, int age, String job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public static void main(String[] args) {
        Person Matt = new Person("Matt" , 26 , "Soldier");
        Person Alan = new Person("Alan" , 29 , "Teacher");
        Person[] person = {Matt, Alan};
        int numberOfElement = person.length;
        int result = 0;

        Soldier soldier = new Soldier("shoot too enemy, defend the country", 5000);
        soldier.getResponsibilities();

        Teacher teacher = new Teacher("check homework, insert grades, teach", 2500);
        teacher.getResponsibilities();


    }

}
