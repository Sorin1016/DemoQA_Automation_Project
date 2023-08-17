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

    @FindBy(xpath = "(//div[@class='rt-td'])")
    private List<WebElement> booksRows;

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public String getNameText() {
        return this.userNameValue.getText();
    }

    public void printBooksTitles() {
        for (WebElement element : booksTitles) {
            System.out.println(element.getText());
        }
    }

    public void printBooksAuthors() {
        for (int i = 2; i <= booksRows.size() ; i += 4) {
            if (!booksRows.get(i).getText().isBlank()) {
                System.out.println(booksRows.get(i).getText());
            }
        }
    }

    public void printBooksPublisher() {
        for (int i = 3; i <= booksRows.size() ; i += 4) {
            if (!booksRows.get(i).getText().isBlank()) {
                System.out.println(booksRows.get(i).getText());
            }
        }
    }
}
