package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.widgets_page.WidgetsPage;
import pages.widgets_page.secondary_pages.ToolTipsPage;

public class ToolTipsTest extends BaseTest{

    private WidgetsPage widgetsPage;
    private ToolTipsPage toolTipsPage;
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.widgetsPage = new WidgetsPage(driver);
        this.toolTipsPage = new ToolTipsPage(driver);
    }

    @Test
    public void hoverTheButtonTest() {
        homePage.scrollToWidgetsButton();
        homePage.clickWidgetsButton();
        widgetsPage.scrollToToolTipsButton();
        widgetsPage.clickToolTipsButton();
        toolTipsPage.scrollToHoverButton();
        toolTipsPage.hoverTheButton();
        toolTipsPage.hoverTextField();
    }
}
