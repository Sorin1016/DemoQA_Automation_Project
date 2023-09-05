package pages.book_store_application_page.secondary_pages;

import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#userName")
    private WebElement username;

    @FindBy(css = "#password")
    private WebElement password;

    @FindBy(css = "#login")
    private WebElement loginButton;

    @FindBy(xpath = "//h5")
    private WebElement loginMessage;

    public void inputValidCredentials() {
        inputText(this.username, Constants.USERNAME);
        inputText(this.password, Constants.PASSWORD);
    }

    public void clickLoginButton() {
        clickElement(this.loginButton);
    }

    public boolean isDisplayedLoginText() {
        return isDisplayed(this.loginMessage);
    }
}
