package pages;

import objects.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends BasePage {
    WebDriver driver;
    @FindBy(id = "user-name")
    WebElement txt_username;
    @FindBy(id = "password")
    WebElement txt_password;
    @FindBy(id = "login-button")
    WebElement btn_Login;
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement lbl_login_message;

    /**
     * All WebElements are identified by @FindBy annotation
     */
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    /**
     * Set username
     *
     * @param username the username value
     */
    private void setUserName(String username) {
        Reporter.log("Set UserName with value: " + username);
        this.setText(txt_username, username);
    }

    /**
     * Set Password
     *
     * @param password the password value
     */
    private void setPassword(String password) {
        Reporter.log("Set Password with value: " + password);
        this.setText(txt_password, password);
    }

    /**
     * Click Login button
     */
    private void clickLogin() {
        Reporter.log("Click Login button");
        this.click(btn_Login);
    }

    /**
     * Login into heroku website with an account
     *
     * @param account
     */
    public void login(Account account) {
        this.setUserName(account.getUsername());
        this.setPassword(account.getPassword());
        this.clickLogin();
    }

    /**
     * Get the message after clicking Login button
     */
    public String getLoginMessage() {
        return this.getTextFromElement(lbl_login_message);
    }

    /**
     * Get the current URL
     */
    public String getCurrentURL() {
        return this.getURL();
    }
}
