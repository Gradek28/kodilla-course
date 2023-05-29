package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleSearchPom extends AbstractGooglePom {
    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(css = "div.yuRUbf > a")
    private List<WebElement> searchResults;

    public GoogleSearchPom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void searchForPhrase(String phrase) {
        searchField.sendKeys(phrase);
        searchField.submit();
    }

    public int getSearchResultsCount() {
        return searchResults.size();
    }

    public void clickRandomSearchResult() {

        int searchResultsCount = getSearchResultsCount();
        if (searchResultsCount > 0) {
            int randomIndex = generateRandomIndex(searchResultsCount);
            WebElement searchResult = searchResults.get(randomIndex);
            searchResult.click();
        }
    }

    private int generateRandomIndex(int maxIndex) {
        Random random = new Random();
        return random.nextInt(maxIndex);
    }
}


