import lib.pages.GmailLoginPage;
import lib.pages.GmailPage;
import lib.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLoginTest {
    @Test
    public void gmailLoginTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("gmail", "pcBrowser");

        try {
            GmailLoginPage gmailLoginPage = new GmailLoginPage(driver);

            GmailPage gmailPage = gmailLoginPage.login("qamitto2020", "qaAutomationTest1!");

            Assert.assertTrue(gmailPage.isLoggedIn());

            Assert.assertTrue(gmailPage.hasUnread());

        //    gmailPage.logout();
        }
        finally {
            //driver.quit();
        }
    }
}
