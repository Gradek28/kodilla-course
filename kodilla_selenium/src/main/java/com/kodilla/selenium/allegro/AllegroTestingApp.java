package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement cookieButton = driver.findElement(By.xpath("//button[contains(@class, 'msts_enp')]"));
        cookieButton.click();

        WebElement categoryDropdown = driver.findElement(By.xpath("//select[@data-role='filters-dropdown-toggle']"));
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByVisibleText("Elektronika");

        WebElement searchInput = driver.findElement(By.xpath("//input[@data-role='search-input']"));
        searchInput.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//button[@data-role='search-button']"));
        searchButton.click();
    }

}
