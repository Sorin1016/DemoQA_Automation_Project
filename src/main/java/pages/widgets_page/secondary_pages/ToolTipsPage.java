package pages.widgets_page.secondary_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;
import utils.Utils;

public class ToolTipsPage extends BasePage {
    public ToolTipsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#toolTipButton")
    private WebElement hoverMeButton;

    @FindBy(xpath = "(//div[@id='buttonToolTip'])[1]")
    private WebElement hoverMeButtonText;

    @FindBy(css = "#texFieldToolTopContainer")
    private WebElement hoverTextField;

    @FindBy(xpath = "//div[@id='textFieldToolTip']")
    private WebElement hoverTextFieldText;

    public void scrollToHoverButton() {
        scrollToElement(this.hoverMeButton);
    }

    public void hoverTheButton() {
        actions.moveToElement(this.hoverMeButton).perform();
        Utils.waitInSeconds(1);
        System.out.println(getText(this.hoverMeButtonText));
    }

    public void hoverTextField() {
        actions.moveToElement(this.hoverTextField).perform();
        Utils.waitInSeconds(2);
        System.out.println(getText(this.hoverTextFieldText));
    }
}
