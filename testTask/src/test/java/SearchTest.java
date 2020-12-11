import lib.pages.GooglePage;
import lib.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SearchTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = WebDriverFactory.getDriver("google", "pcBrowser");
    }

    @Test
    public void testSearch() {

        GooglePage googlePage = new GooglePage(driver);

        googlePage.search("Mitto CH");

        Assert.assertTrue(googlePage.isFirst());

}

    @AfterTest
    public void quit() {
        driver.quit();
    }





}
