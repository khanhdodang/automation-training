package pages;

import objects.CheckoutOverview;
import objects.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;

public class CheckoutStepTwoPage extends BasePage {
    WebDriver driver;
    String cart_item = "//div[@class='cart_list']//div[@class='cart_item'][";
    @FindBy(xpath = "//div[@class='cart_footer']/a[text()='CANCEL']")
    WebElement btn_Cancel;
    @FindBy(xpath = "//div[@class='cart_footer']/a[text()='FINISH']")
    WebElement btn_Finish;
    @FindBy(xpath = "//div[@class='summary_value_label'][1]")
    WebElement lbl_payment_info;
    @FindBy(xpath = "//div[@class='summary_value_label'][2]")
    WebElement lbl_shipping_info;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    WebElement lbl_sub_total;
    @FindBy(xpath = "//div[@class='summary_total_label']")
    WebElement lbl_total;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    WebElement lbl_tax;

    By total_product = By.xpath("//div[@class='cart_item']");

    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    WebElement lbl_product_quantity(int index) {
        String p2 = "]//div[@class='summary_quantity']";
        return this.findElement(By.xpath(cart_item + index + p2));
    }

    WebElement lbl_product_name(int index) {
        String p2 = "]//div[@class='inventory_item_name']";
        return this.findElement(By.xpath(cart_item + index + p2));
    }

    WebElement lbl_product_desc(int index) {
        String p2 = "]//div[@class='inventory_item_desc']";
        return this.findElement(By.xpath(cart_item + index + p2));
    }

    WebElement lbl_product_price(int index) {
        String p2 = "]//div[@class='inventory_item_price']";
        return this.findElement(By.xpath(cart_item + index + p2));
    }

    public Product getProductInfo(int index) {
        Product product = new Product();
        product.setName(this.getTextFromElement(lbl_product_name(index)));
        product.setDesc(this.getTextFromElement(lbl_product_desc(index)));
        product.setPrice(this.getTextFromElement(lbl_product_price(index)));
        product.setQuantity(Integer.parseInt(this.getTextFromElement(lbl_product_quantity(index))));
        return product;
    }

    int totalProducts() {
        return this.getTotalElements(total_product);
    }

    public ArrayList<Product> getProductInfo() {
        ArrayList<Product> products = new ArrayList<Product>();
        for (int i = 1; i <= totalProducts(); i++) {
            products.add(getProductInfo(i));
        }
        return products;
    }

    public CheckoutOverview get_checkout_overview() {
        CheckoutOverview checkoutOverview = new CheckoutOverview();
        checkoutOverview.setPayment_info(this.getTextFromElement(lbl_payment_info));
        checkoutOverview.setShiping_info(this.getTextFromElement(lbl_shipping_info));
        checkoutOverview.setSub_total(this.getTextFromElement(lbl_sub_total));
        checkoutOverview.setTax(this.getTextFromElement(lbl_tax));
        checkoutOverview.setTotal(this.getTextFromElement(lbl_total));
        return checkoutOverview;
    }

    public void clickFinish() {
        this.click(btn_Finish);
    }

    public void clickCancel() {
        this.click(btn_Cancel);
    }

    public void compareCheckoutOverview(CheckoutOverview actual, CheckoutOverview expected) {
        Assert.assertEquals(actual.getPayment_info(), expected.getPayment_info());
        Assert.assertEquals(actual.getShiping_info(), expected.getShiping_info());
        Assert.assertEquals(actual.getSub_total(), expected.getSub_total());
        Assert.assertEquals(actual.getTax(), expected.getTax());
        Assert.assertEquals(actual.getTotal(), expected.getTotal());
    }
}
