package pages.widgets_page.secondary_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".range-slider.range-slider--primary")
    private WebElement slider;

    public void moveTheSlider() {
        actions.dragAndDropBy(this.slider, 300, 0).perform();
    }
}
