package basics.Selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxTest {
    WebDriver driver;

    @Test
    public void select_checkbox_successfully() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"checkboxes\"]/input"));
        WebElement element = elements.get(0);
        element.click();
        boolean isSelected = element.isSelected();
        Assert.assertTrue(isSelected);
        driver.close();
        driver.quit();
    }
}

