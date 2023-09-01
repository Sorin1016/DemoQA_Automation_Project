package pages.elements_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class ElementsPage extends BasePage {
    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//li[@id='item-4'])[1]")
    private WebElement buttonsButton;

    @FindBy(xpath = "(//li[@id='item-1'])[1]")
    private WebElement checkBoxButton;

    @FindBy(xpath = "(//li[@id='item-3'])[1]")
    private WebElement webTablesButton;

    public void clickButtons() {
        clickElement(this.buttonsButton);
    }

    public void clickCheckBox() {
        clickElement(this.checkBoxButton);
    }

    public void clickWebTablesButton() {
        clickElement(this.webTablesButton);
    }
}
