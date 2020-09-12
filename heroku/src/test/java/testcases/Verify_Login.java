package testcases;

import data.Data;
import objects.Account;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.LoginPage;

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

    @Test(priority = 0, description = "Verify test case login successfully")
    public void test_login_with_valid_account() {
        account = Data.validAccount();
        loginPage.login(account);
        String msg = loginPage.getLoginMessage();
        Assert.assertTrue(msg.contains("You logged into a secure area!"));
    }

    @Test(priority = 1, description = "Verify test case login with invalid username")
    public void test_login_with_invalid_username() {
        account = Data.invalidAccountUsername();
        loginPage.login(account);
        String msg = loginPage.getLoginMessage();
        Assert.assertTrue(msg.contains("Your username is invalid!"));
    }

    @Test(priority = 2, description = "Verify test case login with invalid password")
    public void test_login_with_invalid_password() {
        account = Data.invalidAccountPassword();
        loginPage.login(account);
        String msg = loginPage.getLoginMessage();
        Assert.assertTrue(msg.contains("Your password is invalid!"));
    }

    @AfterMethod
    public void tearDown() {
        loginPage.cleanUp();
    }
}
