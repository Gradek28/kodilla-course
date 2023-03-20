package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private double age;
    private Job job;

    public Person(String firstName, double age){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public static void main(String[] args) {
        Person Matt = new Person("Matt", 26);
        Person Alan = new Person("Alan", 29);

        Soldier soldier = new Soldier("shoot too enemy, defend the country", 5000, "Soldier");
        soldier.showResponsibilities();
        soldier.getSalary();
        soldier.showJob();


        Teacher teacher = new Teacher("check homework, insert grades, teach", 2500, "Teacher");
        teacher.showResponsibilities();
        teacher.getSalary();
        teacher.showJob();




    }
}
