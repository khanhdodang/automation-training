package testcases;

import data.Data;
import objects.Account;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.LoginPage;
import pages.ProductPage;

public class Verify_Login {
    WebDriver driver;
    Account account = new Account();
    LoginPage loginPage;

    @Parameters({"browser"})
    @BeforeMethod
    public void SetUp(@Optional("chrome") String browser) {
        BasePage basePage = new BasePage(driver);
        driver = basePage.setupDriver(browser);
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 0, description = "Verify standard_user")
    public void test_login_with_valid_account() {
        account = Data.standardUser();
        loginPage.login(account);
        String getCurrentURL = loginPage.getCurrentURL();
        Assert.assertTrue(getCurrentURL.contains("inventory"));
    }

    @Test(priority = 1, description = "Verify locked_out_user")
    public void test_login_with_locked_out_user() {
        account = Data.lockedoutdUser();
        loginPage.login(account);
        String getCurrentURL = loginPage.getCurrentURL();
        Assert.assertFalse(getCurrentURL.contains("inventory"));
        String msg = loginPage.getLoginMessage();
        Assert.assertEquals(msg, "Epic sadface: Sorry, this user has been locked out.");
    }

    @Test(priority = 2, description = "Verify problem_user")
    public void test_login_with_problem_user() {
        account = Data.problemdUser();
        loginPage.login(account);
        String getCurrentURL = loginPage.getCurrentURL();
        Assert.assertTrue(getCurrentURL.contains("inventory"));

        ProductPage productPage = new ProductPage(driver);
        Assert.assertEquals(productPage.getBrokenImage(), 6);
    }

    @Test(priority = 3, description = "Verify performance_glitch_user")
    public void test_login_with_performance_glitch_user() {
        account = Data.performanceUser();
        loginPage.login(account);
        String getCurrentURL = loginPage.getCurrentURL();
        Assert.assertTrue(getCurrentURL.contains("inventory"));
    }

    @AfterMethod
    public void tearDown() {
        loginPage.cleanUp();
    }
}
