package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.elements_page.ElementsPage;
import pages.elements_page.secondary_pages.CheckBoxPage;
import utils.Utils;

public class CheckBoxTest extends BaseTest{

    private CheckBoxPage checkBoxPage;
    private ElementsPage elementsPage;
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.checkBoxPage = new CheckBoxPage(driver);
        this.elementsPage = new ElementsPage(driver);
    }

    @Test
    public void checkBoxTest() {
        homePage.scrollToElementsButton();
        homePage.clickElementsButton();
        elementsPage.clickCheckBox();
        checkBoxPage.clickToggleButton();
        checkBoxPage.clickExpandAllButton();
        checkBoxPage.clickNotesButton();
        checkBoxPage.clickReactButton();
        checkBoxPage.clickPrivateButton();
        Utils.waitInSeconds(1);
        checkBoxPage.printSuccessMessage();
    }
}
