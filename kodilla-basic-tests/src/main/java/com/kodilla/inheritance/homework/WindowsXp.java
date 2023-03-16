package com.kodilla.inheritance.homework;

public class WindowsXp extends OperatingSystem{
    public WindowsXp(int year){
        super(year);
    }

    @Override
    public void turnOn(){
        System.out.println("Welcome to WindowsXp");
    }
    @Override
    public void turnOff(){
        System.out.println("WindowsXp tells goodbye");
    }
}
