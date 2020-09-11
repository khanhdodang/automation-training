package basics.Selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingStarted3 {
    WebDriver driver;

    @Test
    public void login_successfully() {
        // https://chromedriver.chromium.org/downloads
        // brew cask install chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        System.out.println("Browser Navigation");
        driver.navigate().to("https://the-internet.herokuapp.com/login");

        System.out.println("Going Back");
        driver.navigate().back();

        System.out.println("Going Forward");
        driver.navigate().forward();

        System.out.println("Refreshing the Page");
        driver.navigate().refresh();

        System.out.println("Get Current URL");
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        System.out.println("Get Page Title");
        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);

        System.out.println("Get Page Source");
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        String message = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(message.contains("You logged into a secure area!"));

        System.out.println("To close the current browser window");
        driver.close();

        System.out.println("To quit the WebDriver session at the end of the testing use:");
        driver.quit();
    }
}

