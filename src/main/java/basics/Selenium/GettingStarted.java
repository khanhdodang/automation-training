package basics.Selenium;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class GettingStarted {
    WebDriver driver;

    @Test
    public void login_successfully() {
        // https://chromedriver.chromium.org/downloads
        // brew cask install chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));

        driver.close();
        driver.quit();
    }
}

