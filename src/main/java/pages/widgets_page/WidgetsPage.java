package pages.widgets_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class WidgetsPage extends BasePage {
    public WidgetsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//li[@id='item-0'])[4]")
    private WebElement accordionButton;

    @FindBy(xpath = "(//li[@id='item-1'])[3]")
    private WebElement autoCompleteButton;

    @FindBy(xpath = "(//li[@id='item-3'])[3]")
    private WebElement sliderButton;

    @FindBy(xpath = "(//li[@id='item-4'])[3]")
    private WebElement progressBarButton;

    @FindBy(xpath = "(//li[@id='item-6'])[2]")
    private WebElement toolTipsButton;

    public void clickToolTipsButton() {
        clickElement(this.toolTipsButton);
    }

    public void scrollToToolTipsButton() {
        scrollToElement(this.toolTipsButton);
    }

    public void clickProgressBarButton() {
        clickElement(this.progressBarButton);
    }

    public void scrollToProgressBarButton() {
        scrollToElement(this.progressBarButton);
    }

    public void clickSliderButton() {
        clickElement(this.sliderButton);
    }
    public void scrollToSliderButton() {
        scrollToElement(this.sliderButton);
    }

    public void clickAutoCompleteButton() {
        clickElement(this.autoCompleteButton);
    }

    public void scrollToAutoCompleteButton() {
        scrollToElement(this.autoCompleteButton);
    }

    public void clickAccordionButton() {
        clickElement(this.accordionButton);
    }

    public void scrollToAccordionButton() {
        scrollToElement(this.accordionButton);
    }
}
