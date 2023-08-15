import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        Utils.waitInSeconds(1);
        homePage.scrollDown();
        Utils.waitInSeconds(1);
        homePage.clickBookStore();
        Utils.waitInSeconds(1);
        bookStorePage.printBooksTitles();
    }

    @Test(priority = 3)
    public void printBooksAuthorsTest() {
        Utils.waitInSeconds(1);
        homePage.scrollDown();
        Utils.waitInSeconds(1);
        homePage.clickBookStore();
        Utils.waitInSeconds(1);
        bookStorePage.printBooksAuthors();
    }

    @Test(priority = 4)
    public void printBooksPublishersTest() {
        Utils.waitInSeconds(1);
        homePage.scrollDown();
        Utils.waitInSeconds(1);
        homePage.clickBookStore();
        Utils.waitInSeconds(1);
        bookStorePage.printBooksPublisher();
    }
}
