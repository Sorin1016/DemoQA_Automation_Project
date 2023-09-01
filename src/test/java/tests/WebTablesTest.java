package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.elements_page.ElementsPage;
import pages.elements_page.secondary_pages.WebTablesPage;

public class WebTablesTest extends BaseTest {
    private ElementsPage elementsPage;
    private WebTablesPage webTablesPage;
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.elementsPage = new ElementsPage(driver);
        this.webTablesPage = new WebTablesPage(driver);
    }

    @Test
    public void modifyDataTest() {
        homePage.scrollToElementsButton();
        homePage.clickElementsButton();
        elementsPage.clickWebTablesButton();
        webTablesPage.clickEditButtonNo3();
        webTablesPage.modifySalaryFieldAndSubmit();
        Assert.assertTrue(webTablesPage.verifyIfSalaryChanged());
    }
}
