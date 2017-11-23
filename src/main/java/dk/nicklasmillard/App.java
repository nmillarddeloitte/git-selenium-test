package dk.nicklasmillard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\users\\nmillard\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.dk");
        System.out.println("Successfully opened web browser");
        driver.quit();
    }
}
