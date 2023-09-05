package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.alerts_page.AlertsFrameWindowsPage;
import pages.alerts_page.secondary_pages.AlertsPage;
import utils.Utils;

public class AlertsPageTest extends BaseTest{

    private AlertsFrameWindowsPage alertsFrameWindowsPage;
    private AlertsPage alertsPage;
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.alertsFrameWindowsPage = new AlertsFrameWindowsPage(driver);
        this.alertsPage = new AlertsPage(driver);
    }

    @Test
    public void alertTest() {
        homePage.scrollToAlertsFrameWindowsButton();
        homePage.clickAlertsFrameWindowsButton();
        alertsFrameWindowsPage.clickAlertsButton();
        Utils.waitInSeconds(1);
        alertsPage.clickAlertButton();
        Utils.waitInSeconds(1);
        Utils.acceptAlert(driver);
    }

    @Test
    public void timeAlertTest() {
        homePage.scrollToAlertsFrameWindowsButton();
        homePage.clickAlertsFrameWindowsButton();
        alertsFrameWindowsPage.clickAlertsButton();
        alertsPage.clickTimeAlertButton();
        Utils.waitInSeconds(6);
        Utils.acceptAlert(driver);
    }

    @Test
    public void confirmAlertTest() {
        homePage.scrollToAlertsFrameWindowsButton();
        homePage.clickAlertsFrameWindowsButton();
        alertsFrameWindowsPage.clickAlertsButton();
        Utils.waitInSeconds(1);
        alertsPage.clickConfirmButton();
        Utils.waitInSeconds(1);
        Utils.acceptAlert(driver);
        alertsPage.printConfirmMessage();
    }

    @Test
    public void promptAlertTest() {
        homePage.scrollToAlertsFrameWindowsButton();
        homePage.clickAlertsFrameWindowsButton();
        alertsFrameWindowsPage.clickAlertsButton();
        Utils.waitInSeconds(1);
        alertsPage.clickPromptButton();
        Utils.waitInSeconds(1);
        Utils.dismissAlert(driver);
    }
}
