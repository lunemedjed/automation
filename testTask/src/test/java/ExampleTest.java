import lib.pages.GooglePage;
import lib.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ExampleTest {
    @Test
    public void testSearch() {

    WebDriver driver = WebDriverFactory.getDriver("google", "pcBrowser");


    GooglePage googlePage = new GooglePage(driver);
    try {
        googlePage.search("Mitto CH");
        Assert.assertTrue(googlePage.isFirst());

    }
    finally {
        driver.quit();
    }


}




}
