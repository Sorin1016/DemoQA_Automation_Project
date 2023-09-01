package tests;

import constants.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.book_store_application_page.BookStorePage;
import pages.book_store_application_page.secondary_pages.LoginPage;
import utils.Utils;

public class BooksTest extends BaseTest{

    protected LoginPage loginPage;
    protected BookStorePage bookStorePage;

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.loginPage = new LoginPage(driver);
        this.bookStorePage = new BookStorePage(driver);
    }

    @Test(priority = 5)
    public void verifyBooksListTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.clickLoginButton();
        Utils.waitInSeconds(1);
        loginPage.inputValidCredentials();
        loginPage.clickLoginButton();
        Utils.waitInSeconds(2);
        String actual = bookStorePage.getNameText();
        String expected = Constants.EXPECTED_NAME;
        Assert.assertEquals(actual, expected);
        homePage.printAllBooks();
    }

    @Test(priority = 10)
    public void printAuthorAndPublisherByBookNamePositiveTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.printAuthorAndPublisherIfBookIsPresent("Understanding ECMAScript 6");
    }

    @Test(priority = 11)
    public void printAuthorAndPublisherByBookNameNegativeTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.printAuthorAndPublisherIfBookIsPresent("Harry Potter");
    }

    @Test(priority = 12)
    public void printBookTitleByIndexTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.printBookTitleByIndex(2);
    }

    @Test(priority = 13)
    public void printBookAuthorByIndexTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.printBookAuthorByIndex(8);
    }
}
