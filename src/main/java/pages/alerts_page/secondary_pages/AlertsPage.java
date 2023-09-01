package pages.alerts_page.secondary_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#alertButton")
    private WebElement alertButton;

    @FindBy(css = "#timerAlertButton")
    private WebElement timeAlertButton;

    @FindBy(css = "#confirmButton")
    private WebElement confirmButton;

    @FindBy(css = "#promtButton")
    private WebElement promptButton;

    @FindBy(css = "#confirmResult")
    private WebElement confirmMessage;

    @FindBy(css = "#promptResult")
    private WebElement promptMessage;

    public void clickAlertButton() {
        clickElement(this.alertButton);
    }

    public void clickTimeAlertButton() {
        clickElement(this.timeAlertButton);
    }

    public void clickConfirmButton() {
        clickElement(this.confirmButton);
    }

    public void clickPromptButton() {
        clickElement(this.promptButton);
    }

    public void printConfirmMessage() {
        System.out.println(getText(this.confirmMessage));
    }
}
