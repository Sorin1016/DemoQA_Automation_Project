package pages.book_store_application_page.secondary_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class BooksPage extends BasePage {
    public BooksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//button[@id='addNewRecordButton'])[2]")
    private WebElement addToCartButton;

    @FindBy(xpath = "(//button[@id='addNewRecordButton'])[1]")
    private WebElement backToBookStoreButton;

    public void clickAddToCartButton() {
        clickElement(this.addToCartButton);
    }

    public void clickReturnToBookStoreButton() {
        clickElement(this.backToBookStoreButton);
    }

    public void scrollToAddToCartButton() {
        scrollToElement(this.addToCartButton);
    }

    public void scrollToReturnButton() {
        scrollToElement(this.backToBookStoreButton);
    }
}
