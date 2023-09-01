package pages.alerts_page.secondary_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

import java.util.Set;

public class BrowserWindowsPage extends BasePage {

    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#sampleHeading")
    private WebElement newTabText;

    public void printFromInsideWindows() {
        driver.findElement(By.id("windowButton")).click();
        driver.findElement(By.id("tabButton")).click();
        String parentWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handles : allWindowHandles) {
            if (!parentWindowHandle.equalsIgnoreCase(handles)) {
                driver.switchTo().window(handles);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println(getText(text));
                driver.close();
            }
        }
    }
}
