package pages.elements_page.secondary_pages;

import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;
import utils.Utils;

public class WebTablesPage extends BasePage {
    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#edit-record-3")
    private WebElement editButtonNo3;

    @FindBy(xpath = "(//input[@class=' mr-sm-2 form-control'])[4]")
    private WebElement salaryField;

    @FindBy(css = "#submit")
    private WebElement submitButton;

    @FindBy(xpath = "(//div[@class='rt-td'])[19]")
    private WebElement updatedSalary;

    public void clickEditButtonNo3() {
        clickElement(this.editButtonNo3);
    }

    public void modifySalaryFieldAndSubmit() {
        Utils.waitInSeconds(1);
        clearField(this.salaryField);
        Utils.waitInSeconds(1);
        inputText(this.salaryField, Constants.SALARY);
        Utils.waitInSeconds(1);
        clickElement(this.submitButton);
    }

    public boolean verifyIfSalaryChanged() {
        if(getText(this.updatedSalary).equals(Constants.SALARY)) {
            return true;
        }else {
            return false;
        }
    }
}
