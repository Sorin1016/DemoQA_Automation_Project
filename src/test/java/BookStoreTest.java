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
    public void printBooksTitles() {
        Utils.waitInSeconds(1);
        homePage.scrollDown();
        Utils.waitInSeconds(1);
        homePage.clickBookStore();
        Utils.waitInSeconds(1);
        bookStorePage.printBooksTitles();
    }

    @Test
    public void printBooksAuthors() {
        Utils.waitInSeconds(1);
        homePage.scrollDown();
        Utils.waitInSeconds(1);
        homePage.clickBookStore();
        Utils.waitInSeconds(1);
        bookStorePage.printBooksAuthors();
    }
}
