import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[contains(text(),'Book Store Application')]")
    private WebElement bookStoreAplicationButton;

    public void bookStoreClick() {
        this.bookStoreAplicationButton.click();
    }

    public void scrollDown() {
       scrollToElement(this.bookStoreAplicationButton);
    }
}
