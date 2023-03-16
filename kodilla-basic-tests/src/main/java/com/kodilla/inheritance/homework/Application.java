package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args) {
        WindowsXp windowsXp = new WindowsXp(2001);
        windowsXp.turnOn();
        System.out.println(windowsXp.getYear());
        Windows95 windows95 = new Windows95(1995);
        windows95.turnOff();

    }
}
