import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

    @Test
    public void logInTest() {
        Utils.waitInSeconds(1);
        homePage.scrollDown();
        Utils.waitInSeconds(1);
        homePage.bookStoreClick();
        Utils.waitInSeconds(1);
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
