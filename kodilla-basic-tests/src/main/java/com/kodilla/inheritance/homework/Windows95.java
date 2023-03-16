package com.kodilla.inheritance.homework;

public class Windows95 extends OperatingSystem  {

    public Windows95(int year) {
        super(year);

    }
    public void yearOfPublicationWindows95(){
        System.out.println("Year of publication");
    }


    @Override
    public void turnOn(){
        System.out.println("Welcome to Windows95");
    }
    @Override
    public void turnOff(){
        System.out.println("Windows95 tells goodbye");
    }
}
