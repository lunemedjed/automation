package lib.pages;

import lib.utils.ConfigProperties;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class GmailPage extends BasePage{

    @FindBy(className = "bsU")
    private WebElement unreadEmails;

    public GmailPage (WebDriver driver) {
        super(driver);
    }

    public boolean isLoggedIn() {

        return driver.getCurrentUrl().equals("https://mail.google.com/mail/u/0/#inbox");
    }

    public boolean isLoggedOut() {
        return driver.getCurrentUrl().contains("https://accounts.google.com/ServiceLogin/");
    }

    public boolean hasUnread() {
        try {
            return unreadEmails.isDisplayed();
        }
        catch (NoSuchElementException e) {
            System.out.println("No unread emails");
            return false;
        }
    }

    public void logout() throws InterruptedException {
        driver.navigate().to(ConfigProperties.getURLLogoutGmail());
        TimeUnit.MILLISECONDS.sleep(5000);
    }


}
