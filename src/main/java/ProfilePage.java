import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div[class='text-right button di']")
    private WebElement deleteAllBooksButton;

    @FindBy(css = "#closeSmallModal-ok")
    private WebElement ConfirmDeleteButton;

    @FindBy(xpath = "(//button[@id='submit'])[1]")
    private WebElement logOutButton;

    public void scrollToDeleteButton() {
        scrollToElement(this.deleteAllBooksButton);
    }

    public void clickDeleteAllBooksButton() {
        clickElement(this.deleteAllBooksButton);
    }

    public void clickConfirmDeleteAllBooks() {
        clickElement(this.ConfirmDeleteButton);
    }

    public void scrollToLogOutButton() {
        scrollToElement(this.logOutButton);
    }

    public void clickLogOutButton() {
        clickElement(this.logOutButton);
    }
}
