package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.alerts_page.AlertsFrameWindowsPage;
import pages.alerts_page.secondary_pages.BrowserWindowsPage;
import utils.Utils;

public class BrowserWindowsTest extends BaseTest{
    private AlertsFrameWindowsPage alertsFrameWindowsPage;
    private BrowserWindowsPage browserWindowsPage;
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.browserWindowsPage = new BrowserWindowsPage(driver);
        this.alertsFrameWindowsPage = new AlertsFrameWindowsPage(driver);
    }

    @Test
    public void justTest() {
        homePage.scrollToAlertsFrameWindowsButton();
        Utils.waitInSeconds(1);
        homePage.clickAlertsFrameWindowsButton();
        Utils.waitInSeconds(1);
        alertsFrameWindowsPage.clickBrowserWindowsButton();
        Utils.waitInSeconds(1);
        browserWindowsPage.printFromInsideWindows();
    }
}
