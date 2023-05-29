package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleApp {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\grgra\\Projekty\\kodilla-course\\kodilla-login-selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.google.pl/");
            WebElement cookieElement = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]"));
            cookieElement.click();


            GoogleSearchPom searchPom = new GoogleSearchPom(driver);
            searchPom.searchForPhrase("GROM");
            searchPom.clickRandomSearchResult();
            SearchResultPom resultPom = new SearchResultPom(driver);
            String resultUrl = resultPom.getUrl();
            System.out.println("Clicked search result URL: " + resultUrl);

            driver.quit();
        }
    }