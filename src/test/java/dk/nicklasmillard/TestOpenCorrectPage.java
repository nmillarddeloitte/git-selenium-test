package dk.nicklasmillard;

/**
 * Text text text
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOpenCorrectPage {
    String url = "https://www.google.dk/?gws_rd=ssl";
    WebDriver driver;

    public void testOpenCorrectPage() {
        // Set geckodriver
        System.setProperty("webdriver.gecko.driver", "C:\\users\\nmillard\\Desktop\\geckodriver.exe");
        // Instantiate new firefox driver
        driver = new FirefoxDriver();

        // Open the provided URL
        driver.get(url);

        // Evaluate if the opened url is the same as the provided
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    public void testInputSearchQuery() {
        String searchQuery = "Search this...";

        // Find element on page
        WebElement inputSearchField = driver.findElement(By.id("lst-ib"));
        // Input value in input field
        inputSearchField.sendKeys(searchQuery);
        String valueAfterInput = inputSearchField.getAttribute("value");

        // Check if value was inputted correctly
        Assert.assertEquals(valueAfterInput, searchQuery);
    }

    public void testClickButton() {
        // Find element on page with name "btnK" <- the search button's name
        WebElement inputSearchButton = driver.findElement(By.name("btnK"));
        // Click the button
        inputSearchButton.click();

        String redirectedUrl = driver.getCurrentUrl();

        // Check if url has changed
        Assert.assertNotEquals(redirectedUrl, url);
    }

    @Test
    public void execute() {
        testOpenCorrectPage();
        testInputSearchQuery();
        testClickButton();
    }


}
