package com.kodilla.abstracts.homework;

public abstract class Job {

    private String responsibilities;
    private double salary;

    private Job job;


    public Job(String responsibilities, double salary, String job){
        this.responsibilities = responsibilities;
        this.salary = salary;

    }
    public String showResponsibilities(){
        return responsibilities;
    }
    public double getSalary(){
        return salary;
    }
    public Job showJob(){
        return job;
    }

}

