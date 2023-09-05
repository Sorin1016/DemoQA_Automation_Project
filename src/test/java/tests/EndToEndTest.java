package tests;

import constants.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.book_store_application_page.BookStorePage;
import pages.book_store_application_page.secondary_pages.BooksPage;
import pages.book_store_application_page.secondary_pages.LoginPage;
import pages.ProfilePage;
import utils.Utils;

public class EndToEndTest extends BaseTest{

    private LoginPage loginPage;
    private BookStorePage bookStorePage;
    private BooksPage booksPage;
    private ProfilePage profilePage;

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.loginPage = new LoginPage(driver);
        this.bookStorePage = new BookStorePage(driver);
        this.booksPage = new BooksPage(driver);
        this.profilePage = new ProfilePage(driver);
    }

    @Test
    public void endToEndFlowTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.clickLoginButton();
        Utils.waitInSeconds(1);
        loginPage.inputValidCredentials();
        loginPage.clickLoginButton();
        Utils.waitInSeconds(2);
        String actualName = bookStorePage.getNameText();
        String expectedName = Constants.EXPECTED_NAME;
        Assert.assertEquals(actualName, expectedName);
        bookStorePage.clickGitPocketGuideBookField();
        Utils.waitInSeconds(1);
        booksPage.scrollToAddToCartButton();
        booksPage.clickAddToCartButton();
        Utils.waitInSeconds(1);
        String actualAlertMessage = Utils.getAlertText(driver);
        String expectedAlertMessage = Constants.BOOKS_ADDED_TO_COLLECTION;
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
        Utils.waitInSeconds(1);
        Utils.acceptAlert(driver);
        booksPage.scrollToReturnButton();
        booksPage.clickReturnToBookStoreButton();
        Utils.waitInSeconds(1);
        bookStorePage.scrollToEloquentJavaScripBook();
        bookStorePage.clickEloquentJavaScripBookField();
        Utils.waitInSeconds(1);
        booksPage.scrollToAddToCartButton();
        booksPage.clickAddToCartButton();
        Utils.waitInSeconds(1);
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
        Utils.acceptAlert(driver);
        booksPage.scrollToReturnButton();
        booksPage.clickReturnToBookStoreButton();
        Utils.waitInSeconds(1);
        bookStorePage.scrollToSpeakingJavaScriptBook();
        bookStorePage.clickSpeakingJavaScriptBook();
        Utils.waitInSeconds(1);
        booksPage.scrollToAddToCartButton();
        booksPage.clickAddToCartButton();
        Utils.waitInSeconds(1);
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
        Utils.acceptAlert(driver);
        booksPage.scrollToReturnButton();
        booksPage.clickReturnToBookStoreButton();
        Utils.waitInSeconds(1);
        homePage.scrollToProfileButton();
        homePage.clickProfileButton();
        Utils.waitInSeconds(1);
        profilePage.scrollToDeleteButton();
        profilePage.clickDeleteAllBooksButton();
        Utils.waitInSeconds(1);
        profilePage.clickConfirmDeleteAllBooks();
        Utils.waitInSeconds(1);
        String actualConfirmDeletedMessage = Utils.getAlertText(driver);
        String expectedConfirmDeletedMessage = Constants.ALL_BOOKS_DELETED;
        Assert.assertEquals(actualConfirmDeletedMessage, expectedConfirmDeletedMessage);
        Utils.waitInSeconds(1);
        Utils.acceptAlert(driver);
        profilePage.scrollToLogOutButton();
        profilePage.clickLogOutButton();
        Utils.waitInSeconds(1);
        Assert.assertTrue(loginPage.isDisplayedLoginText());
    }
}
