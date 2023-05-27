package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.get("https://allegro.pl/");

        WebElement cookieElement = driver.findElement(By.className("msts_enp"));
        cookieElement.click();

        Select categorySelect = new Select(driver.findElement(By.tagName("select")));
        categorySelect.selectByVisibleText("Elektronika");

        WebElement inputElement = driver.findElement(By.tagName("input"));
        inputElement.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.cssSelector("button[data-role='search-button']"));
        searchButton.click();

        List<WebElement> productCards = driver.findElements(By.cssSelector("section > article"));

        for (WebElement card : productCards) {
            System.out.println(card.getText());
            System.out.println("----");
        }



    }
}