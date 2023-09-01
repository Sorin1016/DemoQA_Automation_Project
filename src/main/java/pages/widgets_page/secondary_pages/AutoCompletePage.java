package pages.widgets_page.secondary_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;
import utils.Utils;

import java.util.List;

public class AutoCompletePage extends BasePage {
    public AutoCompletePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#autoCompleteMultipleContainer")
    private WebElement typeMultipleColorField;

    @FindBy(css = "#autoCompleteSingleContainer")
    private WebElement typeSingleColorField;

    @FindBy(css = ".css-12jo7m5.auto-complete__multi-value__label")
    private List<WebElement> textFromField;

    public void inputMultipleColor() {
        actions.sendKeys(this.typeMultipleColorField, "red").perform();
        Utils.waitInSeconds(1);
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        actions.sendKeys(this.typeMultipleColorField, "green").perform();
        Utils.waitInSeconds(1);
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        Utils.waitInSeconds(1);
    }

    public void printTTextFromField() {
        for (WebElement element : this.textFromField) {
            System.out.println(getText(element));
        }
    }
}
