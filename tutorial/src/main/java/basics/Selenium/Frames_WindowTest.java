package basics.Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Frames_WindowTest {
    WebDriver driver;

    @Test
    public void test_frame() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.switchTo().parentFrame();

        driver.close();
        driver.quit();
    }

    @Test
    public void test_nested_frames() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.name("frame-top")));
        driver.switchTo().frame(driver.findElement(By.name("frame-left")));
        driver.switchTo().parentFrame();

        driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
        driver.switchTo().parentFrame();

        driver.switchTo().frame(driver.findElement(By.name("frame-right")));
        driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.name("frame-bottom")));
        driver.switchTo().parentFrame();

        driver.close();
        driver.quit();
    }

    @Test
    public void test_window() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/popup.php");
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            System.out.println(driver.switchTo().window(window).getTitle());
            System.out.println(driver.switchTo().window(window).getCurrentUrl());
        }

        driver.close();
        driver.quit();
    }
}
