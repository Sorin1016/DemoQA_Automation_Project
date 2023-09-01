package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public void setup() {
        this.driver = new ChromeDriver();
        this.driver.get("https://demoqa.com/");
        this.driver.manage().window().maximize();
        this.homePage = new HomePage(driver);
    }

    @AfterMethod
    public void closeDriver() {
        this.driver.quit();
    }
}
