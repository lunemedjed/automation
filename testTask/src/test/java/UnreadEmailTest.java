import lib.pages.GmailLoginPage;
import lib.pages.GmailPage;
import lib.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UnreadEmailTest {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = WebDriverFactory.getDriver("gmail", "pcBrowser");
    }

    @Test
    public void unreadEmailTest() throws InterruptedException {


        GmailLoginPage gmailLoginPage = new GmailLoginPage(driver);

        GmailPage gmailPage = gmailLoginPage.login("qamitto2020", "qaAutomationTest1!");

        Assert.assertTrue(gmailPage.isLoggedIn());

        Assert.assertTrue(gmailPage.hasUnread());


    }
    @AfterTest
    public void quit() {
        driver.quit();
    }
}
