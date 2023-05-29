package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StorePomApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\grgra\\Projekty\\kodilla-course\\kodilla-login-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        StorePom storePom = new StorePom(driver);
        int resultsCount = storePom.searchForPhrase("dupa");
        System.out.println(String.valueOf(resultsCount));

        driver.quit();

    }
}

