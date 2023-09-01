package pages.widgets_page.secondary_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base_page.BasePage;
import utils.Utils;

import java.time.Duration;

public class ProgressBarPage extends BasePage {
    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".progress-bar.bg-info")
    private WebElement progressBar;

    @FindBy(css = "#startStopButton")
    private WebElement startStopButton;

    @FindBy(xpath = "//button[@id='resetButton']")
    private WebElement resetButton;

    public void startAndStopTheProgressBar() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        clickElement(this.startStopButton);
        wait.pollingEvery(Duration.ofMillis(10));
        wait.until(ExpectedConditions.attributeToBe(this.progressBar, "aria-valuenow", "80"));
        clickElement(this.startStopButton);
    }

    public boolean checkThePercentage() {
        if (getText(this.progressBar).equals("80%")) {
            return true;
        }else {
            return false;
        }
    }

    public void startProgressBarAndWaitForResetButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        clickElement(this.startStopButton);
        wait.pollingEvery(Duration.ofMillis(10));
        wait.until(ExpectedConditions.attributeToBe(this.progressBar, "aria-valuenow" , "99"));
        Utils.waitInSeconds(1);
        clickElement(this.resetButton);
    }
}
