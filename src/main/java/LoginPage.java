import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void inputValidCredentials() {
        this.username.sendKeys(Constants.USERNAME);
        this.password.sendKeys(Constants.PASSWORD);
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }
}
