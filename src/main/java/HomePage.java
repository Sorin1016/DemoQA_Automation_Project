import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[contains(text(),'Book Store Application')]")
    private WebElement bookStoreApplicationButton;

    @FindBy(css = ".rt-tr-group")
    List<WebElement> booklist;

    @FindBy(xpath = "(//li[@id='item-3'])[5]")
    private WebElement profileButton;

    @FindBy(xpath = "//*[@id='app']/header/a/img")
    private WebElement pageTitle;

    public void clickBookStore() {
        clickElement(this.bookStoreApplicationButton);
    }

    public void scrollDown() {
        scrollToElement(this.bookStoreApplicationButton);
    }

    public void printAllBooks() {
        for (WebElement element : booklist) {
            if (!element.getText().isBlank()) {
                System.out.println(element.getText());
                System.out.println("------------------------------------");
            }
        }
    }

    public void scrollToProfileButton() {
        scrollToElement(this.profileButton);
    }

    public void clickProfileButton() {
        clickElement(this.profileButton);
    }

    public boolean isTitlePresent() {
        return isDisplayed(this.pageTitle);
    }

    public void arriveToBookStorePage() {
        Utils.waitInSeconds(1);
        scrollDown();
        Utils.waitInSeconds(1);
        clickBookStore();
        Utils.waitInSeconds(1);
    }
}
