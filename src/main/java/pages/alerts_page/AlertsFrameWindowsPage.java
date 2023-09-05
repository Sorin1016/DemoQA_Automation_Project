package pages.alerts_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class AlertsFrameWindowsPage extends BasePage {
    public AlertsFrameWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//li[@id='item-1'])[2]")
    private WebElement alertsButton;

    @FindBy(xpath = "(//li[@id='item-0'])[3]")
    private WebElement browserWindowsButton;

    public void clickAlertsButton() {
        clickElement(this.alertsButton);
    }

    public void clickBrowserWindowsButton() {
        clickElement(this.browserWindowsButton);
    }
}
