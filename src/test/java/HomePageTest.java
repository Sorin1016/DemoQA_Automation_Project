import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends BaseTest{

    @Test
    public void verifyPageElementsTest() {
        // Check if page title is present.
        Utils.waitInSeconds(1);
        homePage.scrollDown();
        homePage.clickBookStore();
        Utils.waitInSeconds(1);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.isTitlePresent(), "error1");
        // Check if bookstore subtitle is present.
        softAssert.assertTrue(homePage.isSubTitlePresent(),"error2");
        softAssert.assertTrue(homePage.isSubTitlePresent(), "error3");
        softAssert.assertTrue(homePage.isSubTitlePresent(), "error4");
        softAssert.assertAll();
    }
}
