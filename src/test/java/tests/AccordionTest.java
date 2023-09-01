package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.widgets_page.WidgetsPage;
import pages.widgets_page.secondary_pages.AccordionPage;
import utils.Utils;

public class AccordionTest extends BaseTest {

    private AccordionPage accordionPage;
    private WidgetsPage widgetsPage;
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.widgetsPage = new WidgetsPage(driver);
        this.accordionPage = new AccordionPage(driver);
    }

    @Test
    public void checkIfHeadingAreClosed() {
        homePage.scrollToWidgetsButton();
        homePage.clickWidgetsButton();
        widgetsPage.scrollToAccordionButton();
        widgetsPage.clickAccordionButton();
        accordionPage.clickFirstHeading();
        Utils.waitInSeconds(1);
        accordionPage.printWhichHeadingItsVisible();
    }

    @Test
    public void checkFirstHeadingTest() {
        homePage.scrollToWidgetsButton();
        homePage.clickWidgetsButton();
        widgetsPage.scrollToAccordionButton();
        widgetsPage.clickAccordionButton();
        Utils.waitInSeconds(1);
        accordionPage.printWhichHeadingItsVisible();
    }

    @Test
    public void checkSecondHeadingTest() {
        homePage.scrollToWidgetsButton();
        homePage.clickWidgetsButton();
        widgetsPage.scrollToAccordionButton();
        widgetsPage.clickAccordionButton();
        accordionPage.clickSecondHeading();
        Utils.waitInSeconds(1);
        accordionPage.printWhichHeadingItsVisible();
    }

    @Test
    public void checkThirdHeadingTest() {
        homePage.scrollToWidgetsButton();
        homePage.clickWidgetsButton();
        widgetsPage.scrollToAccordionButton();
        widgetsPage.clickAccordionButton();
        accordionPage.clickThirdHeading();
        Utils.waitInSeconds(1);
        accordionPage.printWhichHeadingItsVisible();
    }
}
