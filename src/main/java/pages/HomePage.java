package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;
import utils.Utils;

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


    @FindBy(xpath = "(//div[@class='card-body'])[1]")
    private WebElement elementsButton;

    @FindBy(xpath = "(//div[@class='card-body'])[3]")
    private WebElement alertsFrameWindowsButton;

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[4]")
    private WebElement widgetsButton;

    public void clickWidgetsButton() {
        clickElement(this.widgetsButton);
    }

    public void scrollToWidgetsButton() {
        scrollToElement(this.widgetsButton);
    }

    public void clickElementsButton() {
        clickElement(this.elementsButton);
    }

    public void clickAlertsFrameWindowsButton() {
        clickElement(this.alertsFrameWindowsButton);
    }

    public void scrollToAlertsFrameWindowsButton() {
        scrollToElement(this.alertsFrameWindowsButton);
    }

    public void scrollToElementsButton() {
        scrollToElement(this.elementsButton);
    }

    public void clickBookStore() {
        clickElement(this.bookStoreApplicationButton);
    }

    public void scrollToBookStoreApplicationButton() {
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
        scrollToBookStoreApplicationButton();
        Utils.waitInSeconds(1);
        clickBookStore();
        Utils.waitInSeconds(1);
    }
}
