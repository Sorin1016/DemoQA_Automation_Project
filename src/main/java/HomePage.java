import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[contains(text(),'Book Store Application')]")
    private WebElement bookStoreAplicationButton;

    @FindBy(css = ".rt-tr-group")
    List<WebElement> booklist;

    @FindBy(xpath = "(//li[@id='item-3'])[5]")
    private WebElement profileButton;

    public void clickBookStore() {
        clickElement(this.bookStoreAplicationButton);
    }

    public void scrollDown() {
        scrollToElement(this.bookStoreAplicationButton);
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
}
