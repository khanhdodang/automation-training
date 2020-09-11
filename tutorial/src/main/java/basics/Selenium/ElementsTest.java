package basics.Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsTest {
    WebDriver driver;

    @Test
    public void test_find_element() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/popup.php");
        driver.findElement(By.linkText("Click Here"));
        driver.findElement(By.partialLinkText("Click Here"));

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.className("example"));
        driver.findElement(By.id("username"));
        driver.findElement(By.name("username"));
        driver.findElement(By.tagName("button"));
        driver.findElement(By.xpath("//button"));
        driver.findElement(By.cssSelector("#username"));

        driver.close();
        driver.quit();
    }

    @Test
    public void test_find_elements() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/popup.php");
        driver.findElements(By.linkText("Click Here"));
        driver.findElements(By.partialLinkText("Click Here"));

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElements(By.className("example"));
        driver.findElements(By.id("username"));
        driver.findElements(By.name("username"));
        driver.findElements(By.tagName("button"));
        driver.findElements(By.xpath("//button"));
        driver.findElements(By.cssSelector("#username"));

        driver.close();
        driver.quit();
    }
}
