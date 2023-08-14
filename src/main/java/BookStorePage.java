import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class BookStorePage extends BasePage {

    public BookStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#login")
    private WebElement loginButton;

    @FindBy(css = "#userName-value")
    private WebElement userNameValue;

    @FindBy(xpath = "(//div[@class='action-buttons'])")
    private List<WebElement> booksTitles;

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public String getNameText() {
        return this.userNameValue.getText();
    }

    public void printBookTitle() {
        for (WebElement element : booksTitles) {
            System.out.println(element.getText());
        }
    }
}
