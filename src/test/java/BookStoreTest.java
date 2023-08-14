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

    @Test
    public void printBooksTitlesTest() {
        Utils.waitInSeconds(1);
        homePage.scrollDown();
        Utils.waitInSeconds(1);
        homePage.clickBookStore();
        Utils.waitInSeconds(1);
        bookStorePage.printBooksTitles();
    }

    @Test
    public void printBooksAuthorsTest() {
        Utils.waitInSeconds(1);
        homePage.scrollDown();
        Utils.waitInSeconds(1);
        homePage.clickBookStore();
        Utils.waitInSeconds(1);
        bookStorePage.printBooksAuthors();
    }

    @Test
    public void printBooksPublishersTest() {
        Utils.waitInSeconds(1);
        homePage.scrollDown();
        Utils.waitInSeconds(1);
        homePage.clickBookStore();
        Utils.waitInSeconds(1);
        bookStorePage.printBooksPublisher();
    }
}
