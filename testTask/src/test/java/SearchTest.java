import lib.pages.GooglePage;
import lib.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchTest {

    @Test
    public void testSearch() {
        //english language
        WebDriver driver = WebDriverFactory.getDriver("google", "pcBrowser", "en");

        try {
            GooglePage googlePage = new GooglePage(driver);
            googlePage.search("Mitto CH");

            Assert.assertTrue(googlePage.isMittoFirst());

            googlePage.search("Митто ЦХ");

            Assert.assertTrue(googlePage.isMittoFirst());
        }
        finally {
            driver.quit();
        }
        //serbian language
        WebDriver driver1 = WebDriverFactory.getDriver("google", "pcBrowser", "rs");
        try {
            GooglePage googlePage = new GooglePage(driver1);
            googlePage.search("Mitto CH");

            Assert.assertTrue(googlePage.isMittoFirst());

            googlePage.search("Митто ЦХ");

            Assert.assertTrue(googlePage.isMittoFirst());
        }
        finally {
            driver1.quit();
        }




}


}
