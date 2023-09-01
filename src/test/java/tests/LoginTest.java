package tests;

import constants.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.book_store_application_page.BookStorePage;
import pages.book_store_application_page.secondary_pages.LoginPage;
import utils.Utils;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;
    private BookStorePage bookStorePage;

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.loginPage = new LoginPage(driver);
        this.bookStorePage = new BookStorePage(driver);
    }

    @Test(priority = 1)
    public void logInTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.clickLoginButton();
        Utils.waitInSeconds(1);
        loginPage.inputValidCredentials();
        loginPage.clickLoginButton();
        Utils.waitInSeconds(2);
        String actual = bookStorePage.getNameText();
        String expected = Constants.EXPECTED_NAME;
        Assert.assertEquals(actual, expected);
    }
}
