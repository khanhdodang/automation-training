package testcases;

import data.Data;
import objects.Account;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.BasePage;
import pages.LoginPage;
import pages.ProductPage;
import utils.Utils;

public class Verify_Product_01 {
    WebDriver driver;
    Account account = new Account();
    LoginPage loginPage;

    @Parameters({"browser"})
    @BeforeMethod
    public void SetUp(@Optional("chrome") String browser) {
        BasePage basePage = new BasePage(driver);
        driver = basePage.setupDriver(browser);
        loginPage = new LoginPage(driver);
        account = Data.standardUser();
        loginPage.login(account);
    }

    @Test(priority = 0, description = "Verify products display correctly")
    public void test_products_display_correctly() {
        ProductPage productPage = new ProductPage(driver);
        for (int i = 1; i <= Utils.productArrayList().size(); i++) {
            productPage.addProduct(i);
            productPage.removeProduct(i);
            productPage.compareProduct(productPage.getProductInfo(i), Utils.productArrayList().get(i - 1));
        }
    }

    @AfterMethod
    public void tearDown() {
        loginPage.cleanUp();
    }
}
