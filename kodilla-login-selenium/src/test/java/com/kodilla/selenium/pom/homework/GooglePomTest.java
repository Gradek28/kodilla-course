package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.homework.GoogleSearchPom;
import com.kodilla.selenium.pom.homework.SearchResultPom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

public class GooglePomTest {
    private WebDriver driver;
    private GoogleSearchPom searchPom;
    private SearchResultPom resultPom;

    @BeforeEach
    public void setUp() {
        // Konfiguracja opcji przeglądarki
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");  // dla otwarcia całego okna

        // Inicjalizacja przeglądarki
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\grgra\\Projekty\\kodilla-course\\kodilla-login-selenium\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.navigate().to("https://www.google.pl/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"L2AGLb\"]"))).click();

        // Inicjalizacja stron Page Object
        searchPom = new GoogleSearchPom(driver);
        resultPom = new SearchResultPom(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSearchAndOpenResult() {
        // Wyszukiwanie frazy
        String searchPhrase = "GROM";
        searchPom.searchForPhrase(searchPhrase);

        // Kliknięcie losowego wyniku wyszukiwania
        searchPom.clickRandomSearchResult();

        // Pobranie URL otwartej strony
        String openedUrl = resultPom.getUrl();

        // Sprawdzenie, czy otwarty URL zawiera frazę wyszukiwania
        assertTrue(openedUrl.contains(searchPhrase), "Opened result does not match the clicked search result");
    }

    @Test
    public void testSearchAndOpenMultipleResults() {
        // Wyszukiwanie frazy
        String searchPhrase = "GROM";
        searchPom.searchForPhrase(searchPhrase);

        // Kliknięcie 3 losowych wyników wyszukiwania
        for (int i = 0; i < 3; i++) {
            searchPom.clickRandomSearchResult();
            driver.navigate().back();
        }

        // Sprawdzenie, czy ostatni otwarty URL zawiera frazę wyszukiwania
        String lastOpenedUrl = resultPom.getUrl();
        assertTrue(lastOpenedUrl.contains(searchPhrase), "Last opened result does not match the clicked search result");
    }
}
