package pages.widgets_page.secondary_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class AccordionPage extends BasePage {
    public AccordionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#section1Heading")
    private WebElement firstHeading;

    @FindBy(css = "#section2Heading")
    private WebElement secondHeading;

    @FindBy(css = "#section3Heading")
    private WebElement thirdHeading;

    public void clickFirstHeading() {
        clickElement(this.firstHeading);
    }

    public void clickSecondHeading() {
        clickElement(this.secondHeading);
    }

    public void clickThirdHeading() {
        clickElement(this.thirdHeading);
    }

    public void printWhichHeadingItsVisible() {
        String firstClass = driver
                .findElement(By.xpath("//*[@id='accordianContainer']/div/div[1]/div[2]"))
                .getAttribute("class");
        String secondClass = driver
                .findElement(By.xpath("//*[@id='accordianContainer']/div/div[2]/div[2]"))
                .getAttribute("class");
        String thirdClass = driver
                .findElement(By.xpath("//*[@id='accordianContainer']/div/div[3]/div[2]"))
                .getAttribute("class");
        if (firstClass.contains("collapse show")) {
            System.out.println("First heading it's open !");
        } else
            if (secondClass.contains("collapse show")) {
            System.out.println("Second heading it's open !");
        } else
            if (thirdClass.contains("collapse show")) {
                System.out.println("Third heading it's open !");
            } else {
                System.out.println("All the heading are closed !");
            }
    }
}
