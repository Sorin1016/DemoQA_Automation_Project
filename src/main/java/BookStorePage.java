import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStorePage {

    @FindBy(css = "#login")
    private WebElement loginButton;

    @FindBy(css = "#userName-value")
    private WebElement userNameValue;

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public String getNameText() {
        return this.userNameValue.getText();
    }
}
