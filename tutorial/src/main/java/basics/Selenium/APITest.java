package basics.Selenium;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class APITest {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    //    @Test
    public void test_checkbox() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='checkboxes']/input"));
        elements.get(0).click();
        elements.get(0).isSelected();
        elements.get(0).isDisplayed();
        elements.get(0).isEnabled();

        elements.get(1).click();
        elements.get(1).isSelected();
        elements.get(1).isDisplayed();
        elements.get(1).isEnabled();
    }

    //    @Test
    public void test_sendkeys_clear_submit() {
        driver.get("https://www.geeksforgeeks.org/");
        WebElement element = driver.findElement(By.id("gsc-i-id1"));
        element.sendKeys("Arrays");
        element.click();
        element.clear();

        element.sendKeys("Arrays");
        element.submit();
    }

    //    @Test
    public void test_get_attributes() {
        driver.get("https://www.geeksforgeeks.org/");
        WebElement element = driver.findElement(By.linkText("Courses"));
        element.getAttribute("href");
        element.getText();
        element.getRect();
        element.getSize();
        element.getLocation();
        element.getTagName();
        element.getCssValue("width");
    }

    @Test
    public void test_scrolls() {
        driver.get("https://www.geeksforgeeks.org/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
    }

    //    @Test
    public void test_screenshot() throws IOException {
        driver.get("https://www.geeksforgeeks.org/");

        // Capture screenshot for the whole screen
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        FileUtils.copyFile(file, new File("FullScreen.png"), true);

        file = OutputType.FILE.convertFromBase64Png(screenshotBase64);
        FileUtils.copyFile(file, new File("FullScreen2.png"), true);

        // Capture screenshot for the element

        WebElement element = driver.findElement(By.linkText("Courses"));
        file = element.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file, new File("Elementcreen.png"), true);

        screenshotBase64 = element.getScreenshotAs(OutputType.BASE64);
        file = OutputType.FILE.convertFromBase64Png(screenshotBase64);
        FileUtils.copyFile(file, new File("Elementcreen2.png"), true);
    }
}

