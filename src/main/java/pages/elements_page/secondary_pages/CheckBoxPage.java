package pages.elements_page.secondary_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;
import java.util.List;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//button[@class='rct-collapse rct-collapse-btn'])[1]")
    private WebElement toggleButton;

    @FindBy(css = ".rct-icon.rct-icon-expand-all")
    private WebElement expandAllButton;

    @FindBy(css = "label[for='tree-node-react']")
    private WebElement reactButton;

    @FindBy(css = "label[for='tree-node-private']")
    private WebElement privateButton;

    @FindBy(css = "label[for='tree-node-notes']")
    private WebElement notesButton;

    @FindBy(css = ".text-success")
    private List<WebElement> successText;

    public void clickToggleButton() {
        clickElement(this.toggleButton);
    }

    public void clickExpandAllButton() {
        clickElement(this.expandAllButton);
    }

    public void clickReactButton() {
        clickElement(this.reactButton);
    }

    public void clickPrivateButton() {
        clickElement(this.privateButton);
    }

    public void clickNotesButton() {
        clickElement(this.notesButton);
    }

    public void printSuccessMessage() {
        for (WebElement e : successText) {
            System.out.println(getText(e));
        }
    }
}
