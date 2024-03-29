package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StorePom extends AbstractStorePom{
    @FindBy(xpath = "//*[@id=\"searchField\"]")
    WebElement searchField;

    @FindBy(css = "div[class=\"element\"]")
    List<WebElement> elementFields;

    public StorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int searchForPhrase(String phrase)  throws InterruptedException {
        searchField.sendKeys(phrase);
        Thread.sleep(1000); // Dodatkowe opóźnienie, aby poczekać na wyniki wyszukiwania
        return elementFields.size();

    }
    public void tearDown() {
        driver.quit();
    }
}

