package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.elements_page.secondary_pages.ButtonsPage;
import pages.elements_page.ElementsPage;
import utils.Utils;

public class ButtonsTest extends BaseTest {

    private ElementsPage elementsPage;
    private ButtonsPage buttonsPage;

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.elementsPage = new ElementsPage(driver);
        this.buttonsPage = new ButtonsPage(driver);
    }

    @Test
    public void clickEveryButtonTest() {
        homePage.scrollToElementsButton();
        homePage.clickElementsButton();
        Utils.waitInSeconds(2);
        elementsPage.clickButtons();
        buttonsPage.doubleClickButton();
        buttonsPage.printDoubleClickMessage();
        buttonsPage.rightClickButton();
        buttonsPage.printRightClickMessage();
        buttonsPage.clickDynamicClickButton();
        buttonsPage.printDynamicClickMessage();
    }
}
