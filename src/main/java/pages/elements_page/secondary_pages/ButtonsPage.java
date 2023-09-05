package pages.elements_page.secondary_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class ButtonsPage extends BasePage {
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#doubleClickBtn")
    private WebElement doubleClickButton;

    @FindBy(css = "#doubleClickMessage")
    private WebElement doubleClickMessage;

    @FindBy(css = "#rightClickBtn")
    private WebElement rightClickButton;

    @FindBy(css = "#rightClickMessage")
    private WebElement rightClickMessage;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
    private WebElement dynamicClickMeButton;

    @FindBy(css = "#dynamicClickMessage")
    private WebElement dynamicClickMessage;

    public void doubleClickButton () {
        doubleClickElement(this.doubleClickButton);
    }

    public void printDoubleClickMessage() {
        System.out.println(getText(this.doubleClickMessage));
    }

    public void rightClickButton() {
        rightClickElement(this.rightClickButton);
    }

    public void printRightClickMessage() {
        System.out.println(getText(this.rightClickMessage));
    }

    public void clickDynamicClickButton() {
        clickElement(this.dynamicClickMeButton);
    }

    public void printDynamicClickMessage() {
        System.out.println(getText(this.dynamicClickMessage));
    }
}
