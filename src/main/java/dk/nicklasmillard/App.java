package dk.nicklasmillard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.annotation.Target;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\users\\nmillard\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        System.out.println( "Hello World!" );

        driver.get("http://www.google.dk");
        System.out.println("Successfully opened web browser");
        driver.quit();
    }
}
