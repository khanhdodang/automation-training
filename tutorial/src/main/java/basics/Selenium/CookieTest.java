package basics.Selenium;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieTest {
    WebDriver driver;

    @Test
    public void test_cookie() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        driver.get("http://www.python.org");

        Cookie cookie = new Cookie("bar", "foo");
        driver.manage().addCookie(cookie);   //Create and add the cookie
        driver.manage().getCookies();   // Return The List of all Cookies
        driver.manage().getCookieNamed("bar");  //Return specific cookie according to name
        driver.manage().deleteCookie(cookie);  // Delete specific cookie
        driver.manage().deleteCookieNamed("bar"); // Delete specific cookie according Name
        driver.manage().deleteAllCookies();  // Delete all cookies

        driver.close();
        driver.quit();
    }
}

