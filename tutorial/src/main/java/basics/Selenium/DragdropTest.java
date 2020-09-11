package basics.Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragdropTest {
    WebDriver driver;

    @Test
    public void test_drag_drop() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        // Launch Website
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        //WebElement on which drag and drop operation needs to be performed
        WebElement from = driver.findElement(By.id("sourceImage"));

        //WebElement to which the above object is dropped
        WebElement to = driver.findElement(By.id("targetDiv"));

        //Creating object of Actions class to build composite actions
        Actions act = new Actions(driver);

        //Performing the drag and drop action
        act.dragAndDrop(from, to).build().perform();

        driver.close();
        driver.quit();
    }
}

