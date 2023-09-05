package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.widgets_page.WidgetsPage;
import pages.widgets_page.secondary_pages.AutoCompletePage;
import utils.Utils;

public class AutoCompleteTest extends BaseTest{

    private AutoCompletePage autoCompletePage;
    private WidgetsPage widgetsPage;

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.autoCompletePage = new AutoCompletePage(driver);
        this.widgetsPage = new WidgetsPage(driver);
    }

    @Test
    public void autoCompleteField() {
        homePage.clickWidgetsButton();
        widgetsPage.scrollToAutoCompleteButton();
        widgetsPage.clickAutoCompleteButton();
        Utils.waitInSeconds(1);
        autoCompletePage.inputMultipleColor();
        autoCompletePage.printTTextFromField();
    }
}
