import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//h5[contains(text(),'Book Store Application')]")
    private WebElement bookStoreAplicationButton;

    public void bookStoreClick() {
        this.bookStoreAplicationButton.click();
    }
}
