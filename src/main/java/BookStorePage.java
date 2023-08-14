import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
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

    @FindBy(xpath = "(//div[@class='rt-td'])[3]")
    private WebElement booksAuthors1;

    @FindBy(xpath = "(//div[@class='rt-td'])[7]")
    private WebElement booksAuthors2;

    @FindBy(xpath = "(//div[@class='rt-td'])[11]")
    private WebElement booksAuthors3;

    @FindBy(xpath = "(//div[@class='rt-td'])[15]")
    private WebElement booksAuthors4;

    @FindBy(xpath = "(//div[@class='rt-td'])[19]")
    private WebElement booksAuthors5;

    @FindBy(xpath = "(//div[@class='rt-td'])[23]")
    private WebElement booksAuthors6;

    @FindBy(xpath = "(//div[@class='rt-td'])[27]")
    private WebElement booksAuthors7;

    @FindBy(xpath = "(//div[@class='rt-td'])[31]")
    private WebElement booksAuthors8;

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
        List<WebElement> authorsList = new ArrayList<>();
        authorsList.add(booksAuthors1);
        authorsList.add(booksAuthors2);
        authorsList.add(booksAuthors3);
        authorsList.add(booksAuthors4);
        authorsList.add(booksAuthors5);
        authorsList.add(booksAuthors6);
        authorsList.add(booksAuthors7);
        authorsList.add(booksAuthors8);
        for (WebElement element : authorsList) {
            System.out.println(element.getText());
        }
    }
}
