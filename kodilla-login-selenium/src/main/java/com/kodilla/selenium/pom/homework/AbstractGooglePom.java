package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;

public abstract class AbstractGooglePom {
    protected WebDriver driver;
    public AbstractGooglePom(WebDriver driver) {
        this.driver = driver;
    }
}
