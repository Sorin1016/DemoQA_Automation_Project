package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.widgets_page.WidgetsPage;
import pages.widgets_page.secondary_pages.SliderPage;

public class SliderTest extends BaseTest{

    private WidgetsPage widgetsPage;
    private SliderPage sliderPage;
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        this.widgetsPage = new WidgetsPage(driver);
        this.sliderPage = new SliderPage(driver);
    }

    @Test
    public void slideTest() {
        homePage.scrollToWidgetsButton();
        homePage.clickWidgetsButton();
        widgetsPage.scrollToSliderButton();
        widgetsPage.clickSliderButton();
        sliderPage.moveTheSlider();
    }
}
