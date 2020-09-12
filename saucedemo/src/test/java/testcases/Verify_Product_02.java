package testcases;

import data.Data;
import objects.Account;
import objects.Product;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import utils.Utils;

import java.util.ArrayList;

public class Verify_Product_02 {
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

    @Test(priority = 0, description = "Verify checkout products")
    public void test_checkout_product() {
        ProductPage productPage = new ProductPage(driver);
        for (int i = 1; i <= 3; i++) {
            productPage.addProduct(i);
        }

        CartPage cartPage = new CartPage(driver);
        cartPage.go_to_cart_page();

        ArrayList<Product> arrayList = new ArrayList<Product>();
        for (int i = 1; i <= 3; i++) {
            Product product = new Product();
            product = cartPage.getProductInfo(i);
            arrayList.add(Utils.productArrayList().get(i - 1));
            productPage.compareProduct(product, Utils.productArrayList().get(i - 1));
        }
        cartPage.click_checkout();

        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(driver);
        checkoutStepOnePage.addUserInfo(Utils.checkoutInfo());

        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage(driver);
        for (int i = 1; i <= 3; i++) {
            Product product = new Product();
            product = checkoutStepTwoPage.getProductInfo(i);
            productPage.compareProduct(product, arrayList.get(i - 1));
        }

        checkoutStepTwoPage.compareCheckoutOverview(checkoutStepTwoPage.get_checkout_overview(), Utils.checkoutOverview());
        checkoutStepTwoPage.clickFinish();

        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
        Assert.assertEquals(checkoutCompletePage.get_header_info(), "THANK YOU FOR YOUR ORDER");
        Assert.assertEquals(checkoutCompletePage.get_message_info(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
        Assert.assertTrue(checkoutCompletePage.does_image_show());
    }

    @AfterMethod
    public void tearDown() {
        loginPage.cleanUp();
    }
}
