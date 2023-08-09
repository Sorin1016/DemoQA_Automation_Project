import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
        this.loginPage = new LoginPage();
        this.bookStorePage = new BookStorePage();
    }

    @Test
    public void logInTest() {
        Utils.waitInSeconds(1);
        WebElement element = driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        homePage.bookStoreClick();
        Utils.waitInSeconds(1);
        bookStorePage.clickLoginButton();
        Utils.waitInSeconds(1);
        loginPage.inputValidCredentials();
        loginPage.clickLoginButton();
        Utils.waitInSeconds(1);
        String actual = bookStorePage.getNameText();
        String expected = Constants.EXPECTED_NAME;
        Assert.assertEquals(actual, expected);
    }
}
