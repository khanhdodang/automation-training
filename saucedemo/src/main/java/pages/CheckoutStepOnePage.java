package pages;

import objects.CheckoutInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage extends BasePage {
    WebDriver driver;
    @FindBy(id = "first-name")
    WebElement txt_firstname;
    @FindBy(id = "last-name")
    WebElement txt_lastname;
    @FindBy(id = "postal-code")
    WebElement txt_postalcode;
    @FindBy(xpath = "//div[@class='checkout_buttons']/a[text()='CANCEL']")
    WebElement btn_Cancel;
    @FindBy(xpath = "//div[@class='checkout_buttons']/input[@value='CONTINUE']")
    WebElement btn_Continue;
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement lbl_message;

    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void addUserInfo(CheckoutInfo checkoutInfo) {
        this.setText(txt_firstname, checkoutInfo.getFirstname());
        this.setText(txt_lastname, checkoutInfo.getLastname());
        this.setText(txt_postalcode, checkoutInfo.getZipcode());
        this.click(btn_Continue);
    }

    public void clickCancel() {
        this.click(btn_Cancel);
    }
}
