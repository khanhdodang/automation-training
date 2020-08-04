package basics.Selenium;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

import java.io.File;

public class GettingStarted {
    WebDriver driver;

    @Test
    public void login_state_should_be_restored() {
        // https://chromedriver.chromium.org/downloads
//        System.setProperty("webdriver.chrome.driver", "/Users/khanhdo/Documents/Kobiton/automation-training/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();

        driver.get("http://www.example.com/login");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.id("login")).click();

        Assert.assertTrue(
                driver.findElement(By.id("welcome")).isDisplayed());

        driver.close();
    }
}

