package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage extends BasePage {
    WebDriver driver;
    @FindBy(xpath = "//h2[@class='complete-header']")
    WebElement lbl_header;

    @FindBy(xpath = "//div[@class='complete-text']")
    WebElement lbl_message;

    @FindBy(xpath = "//img[@class='pony_express']")
    WebElement img_checkout;

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public String get_header_info() {
        return this.getTextFromElement(lbl_header);
    }

    public String get_message_info() {
        return this.getTextFromElement(lbl_message);
    }

    public boolean does_image_show() {
        return this.isDisplayed(img_checkout);
    }
}
