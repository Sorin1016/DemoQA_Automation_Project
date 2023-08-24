import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BookStoreTest extends BaseTest{

    private BookStorePage bookStorePage;

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.bookStorePage = new BookStorePage(driver);
    }

    @Test(priority = 2)
    public void printBooksTitlesTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.printBooksTitles();
    }

    @Test(priority = 3)
    public void printBooksAuthorsTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.printBooksAuthors();
    }

    @Test(priority = 4)
    public void printBooksPublishersTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.printBooksPublisher();
    }

    @Test(priority = 6)
    public void verifyPageElementsTest() {
        homePage.arriveToBookStorePage();
        SoftAssert softAssert = new SoftAssert();
        // Check if page title is present.
        softAssert.assertTrue(homePage.isTitlePresent(), Constants.TITLE_NOT_PRESENT);
        // Check if bookstore subtitle is present.
        softAssert.assertTrue(bookStorePage.isSubTitlePresent(), Constants.SUBTITLE_NOT_PRESENT);
        // Check if type to search is present.
        softAssert.assertTrue(bookStorePage.isDisplayedTypeToSearch(), Constants.TYPE_TO_SEARCH);
        // Check if login button is present.
        softAssert.assertTrue(bookStorePage.isDisplayedLoginButton(), Constants.LOGIN_BUTTON);
        // Check if "Imagine" word is present.
        softAssert.assertTrue(bookStorePage.isDisplayedImageWord(), Constants.IMAGE_WORD);
        // Check if "Title" word is present.
        softAssert.assertTrue(bookStorePage.isDisplayedTitleWord(), Constants.TITLE_WORD);
        // Check if "Author" word is present.
        softAssert.assertTrue(bookStorePage.isDisplayedAuthorWord(), Constants.AUTHOR_WORD);
        // Check if "Publisher" word is present.
        softAssert.assertTrue(bookStorePage.isDisplayedPublisherWord(), Constants.PUBLISHER_WORD);
        // Check if 6 menu buttons is present.
        softAssert.assertTrue(bookStorePage.isDisplayedSixMenuButtons(), Constants.MENU_BUTTONS);
        softAssert.assertAll();
    }

    @Test(priority = 7)
    public void isDisplayedTypeToSearchTest() {
        homePage.arriveToBookStorePage();
        Assert.assertTrue(bookStorePage.isDisplayedTypeToSearch());
    }

    @Test(priority = 8)
    public void printAuthorByTitleTest() {
        homePage.arriveToBookStorePage();
        bookStorePage.findAuthorByTitle("Git Pocket Guide");
    }

    @Test(priority = 9)
    public void printTitleByAuthor() {
        homePage.arriveToBookStorePage();
        bookStorePage.findTitleByAuthor("Addy Osmani");
    }
}
