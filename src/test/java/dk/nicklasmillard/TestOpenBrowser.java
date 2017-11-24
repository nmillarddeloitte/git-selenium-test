package dk.nicklasmillard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class TestOpenBrowser {

    //@Test
    public void TestOpenBrowser() {
        // Set geckodriver
        System.setProperty("webdriver.gecko.driver", "C:\\users\\nmillard\\Desktop\\geckodriver.exe");
        // Instantiate new firefox driver
        WebDriver driver = new FirefoxDriver();

        System.out.println( "Hello World!" );

        // Send get request to URL
        driver.get("http://www.google.dk");
        System.out.println("Successfully opened web browser");
        // Close browser
        driver.quit();
    }

}
