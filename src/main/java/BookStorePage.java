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

    @FindBy(css = "span[id='see-book-Git Pocket Guide']")
    private WebElement gitPocketGuideBook;

    @FindBy(css = "span[id='see-book-Eloquent JavaScript, Second Edition']")
    private WebElement eloquentJavaScripBook;

    @FindBy(css = "span[id='see-book-Speaking JavaScript']")
    private WebElement speakingJavaScriptBook;

    public void clickLoginButton() {
        clickElement(this.loginButton);
    }

    public String getNameText() {
        return getText(this.userNameValue);
    }

    public void printBooksTitles() {
        for (WebElement element : booksTitles) {
            System.out.println(getText(element));
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

    public void clickGitPocketGuideBookField() {
        clickElement(this.gitPocketGuideBook);
    }

    public void clickEloquentJavaScripBookField() {
        clickElement(this.eloquentJavaScripBook);
    }

    public void scrollToEloquentJavaScripBook() {
        scrollToElement(this.eloquentJavaScripBook);
    }

    public void scrollToSpeakingJavaScriptBook() {
        scrollToElement(this.speakingJavaScriptBook);
    }

    public void clickSpeakingJavaScriptBook() {
        clickElement(this.speakingJavaScriptBook);
    }
}
