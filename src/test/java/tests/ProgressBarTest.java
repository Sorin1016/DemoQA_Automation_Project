package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.widgets_page.WidgetsPage;
import pages.widgets_page.secondary_pages.ProgressBarPage;

public class ProgressBarTest extends BaseTest{

    private WidgetsPage widgetsPage;
    private ProgressBarPage progressBarPage;
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.widgetsPage = new WidgetsPage(driver);
        this.progressBarPage = new ProgressBarPage(driver);
    }

    @Test
    public void stopProgressBarAt80Test() {
        homePage.clickWidgetsButton();
        widgetsPage.scrollToProgressBarButton();
        widgetsPage.clickProgressBarButton();
        progressBarPage.startAndStopTheProgressBar();
        Assert.assertTrue(progressBarPage.checkThePercentage());
    }

    @Test
    public void resetProgressBar() {
        homePage.clickWidgetsButton();
        widgetsPage.scrollToProgressBarButton();
        widgetsPage.clickProgressBarButton();
        progressBarPage.startProgressBarAndWaitForResetButton();
    }
}
