package com.kodilla.selenium.pom.homework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StorePomTest {
    WebDriver driver;
    StorePom storePom;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new StorePom(driver);
    }

    @ParameterizedTest
    @CsvSource({"NoteBook, 2", "schOOL, 1", "Brand, 1","BUSSINES, 1", "gaming, 1", "powerful, 0"})
    public void testSearchResultsCount(String phrase, int expectedResultsCount) throws InterruptedException {
        int actualResultsCount = storePom.searchForPhrase(phrase);
        assertEquals(expectedResultsCount, actualResultsCount);
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
