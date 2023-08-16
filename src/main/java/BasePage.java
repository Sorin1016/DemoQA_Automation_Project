import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    protected void clickElement(WebElement element) {
        element.click();
    }

    protected void inputText(WebElement element, String text) {
        element.sendKeys(text);
    }

    protected String getText(WebElement element) {
        return element.getText();
    }

    protected boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }
}
