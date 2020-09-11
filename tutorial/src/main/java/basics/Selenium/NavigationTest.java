package basics.Selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    WebDriver driver;

    @Test
    public void test_navigations() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        driver.get("http://google.com");
        driver.get("https://the-internet.herokuapp.com/");

        // To move backward and forward in your browser’s history
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.close();
        driver.quit();
    }
}

