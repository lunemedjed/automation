import lib.pages.GmailLoginPage;
import lib.pages.GmailPage;
import lib.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GmailLogoutTest {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = WebDriverFactory.getDriver("gmail", "pcBrowser");
    }

    @Test
    public void logoutGmailTest() throws InterruptedException {


        GmailLoginPage gmailLoginPage = new GmailLoginPage(driver);

        GmailPage gmailPage = gmailLoginPage.login("qamitto2020", "qaAutomationTest1!");

        gmailPage.logout();

        Assert.assertTrue(gmailPage.isLoggedOut());

    }
    @AfterTest
    public void quit() {
        driver.quit();
    }

}
