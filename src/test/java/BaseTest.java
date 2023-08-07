import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {

    @Test
    public void goToWebsite() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
    }

    @Test
    public void logInTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#login")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#userName")).sendKeys("SorinMihai");
        driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty123!");
        driver.findElement(By.cssSelector("#login")).click();
        Thread.sleep(1000);
        String actual = driver.findElement(By.cssSelector("#userName-value")).getText();
        String expected = "SorinMihai";
        Assert.assertEquals(actual, expected);
        Thread.sleep(1000);
        WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Speaking JavaScript')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Speaking JavaScript')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#addNewRecordButton")).click();
        Thread.sleep(1000);
        //driver.close();
    }
}
