package pages;

import objects.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;

public class ProductPage extends BasePage {
    String cart_item = "//div[@class='inventory_list']//div[@class='inventory_item'][";
    WebDriver driver;
    By img_broken = By.xpath("//img[contains(@src, 'jpgWithGarbageOnItToBreakTheUrl')]");
    By total_product = By.xpath("//div[@class='inventory_item']");

    public ProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    WebElement product_img(int index) {
        String p2 = "]//div[@class='inventory_item_img']";
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

    WebElement btn_add_to_cart(int index) {
        String p2 = "]//button[text()='ADD TO CART']";
        return this.findElement(By.xpath(cart_item + index + p2));
    }

    WebElement btn_remove_from_cart(int index) {
        String p2 = "]//button[text()='REMOVE']";
        return this.findElement(By.xpath(cart_item + index + p2));
    }

    int totalProducts() {
        return this.getTotalElements(total_product);
    }

    public int getBrokenImage() {
        return this.getTotalElements(img_broken);
    }

    public void addProduct(int index) {
        this.click(btn_add_to_cart(index));
    }

    public void removeProduct(int index) {
        this.click(btn_remove_from_cart(index));
    }

    public Product getProductInfo(int index) {
        Product product = new Product();
        product.setName(this.getTextFromElement(lbl_product_name(index)));
        product.setDesc(this.getTextFromElement(lbl_product_desc(index)));
        product.setPrice(this.getTextFromElement(lbl_product_price(index)));
        return product;
    }

    public ArrayList<Product> getProductInfo() {
        ArrayList<Product> products = new ArrayList<Product>();
        for (int i = 1; i <= totalProducts(); i++) {
            products.add(getProductInfo(i));
        }
        return products;
    }

    public void compareProduct(Product actual, Product expected) {
        try {
            Assert.assertEquals(actual.getName(), expected.getName());
        } catch (AssertionError ex) {
            System.err.println(ex.getMessage());
        }

        try {
            Assert.assertEquals(actual.getDesc(), expected.getDesc());
        } catch (AssertionError ex) {
            System.err.println(ex.getMessage());
        }

        try {
            Assert.assertEquals(actual.getPrice(), expected.getPrice());
        } catch (AssertionError ex) {
            System.err.println(ex.getMessage());
        }
    }
}
