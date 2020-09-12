package pages;

import objects.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class CartPage extends BasePage {
    String cart_item = "//div[@class='cart_list']//div[@class='cart_item'][";
    By total_product = By.xpath("//div[@class='cart_item']");

    @FindBy(id = "shopping_cart_container")
    WebElement icon_cart_badge;
    @FindBy(xpath = "//div[@class='cart_footer']/a[text()='CHECKOUT']")
    WebElement btn_Checkout;

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    WebElement btn_Remove(int index) {
        String p2 = "]//button[text()='REMOVE']";
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

    WebElement lbl_product_quantity(int index) {
        String p2 = "]//div[@class='cart_quantity']";
        return this.findElement(By.xpath(cart_item + index + p2));
    }

    public void go_to_cart_page() {
        this.click(icon_cart_badge);
    }

    public void click_checkout() {
        this.click(btn_Checkout);
    }

    public void remove_product(int index) {
        this.click(btn_Remove(index));
    }

    public Product getProductInfo(int index) {
        Product product = new Product();
        product.setName(this.getTextFromElement(lbl_product_name(index)));
        product.setDesc(this.getTextFromElement(lbl_product_desc(index)));
        product.setPrice(this.getTextFromElement(lbl_product_price(index)));
        product.setQuantity(Integer.parseInt(this.getTextFromElement(lbl_product_quantity(index))));
        return product;
    }

    public ArrayList<Product> getProductInfo() {
        ArrayList<Product> products = new ArrayList<Product>();
        for (int i = 1; i <= totalProducts(); i++) {
            products.add(getProductInfo(i));
        }
        return products;
    }

    int totalProducts() {
        return this.getTotalElements(total_product);
    }
}
