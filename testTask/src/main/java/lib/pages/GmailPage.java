package lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPage extends BasePage{

    @FindBy(className = "bsU")
    private WebElement unreadEmails;

    @FindBy(className = "gb_D gb_Na gb_i")
    private WebElement userMenu;

    @FindBy(id = "gb_71")
    private WebElement logout;

    public GmailPage (WebDriver driver) {
        super(driver);
    }

    public boolean isLoggedIn () {

        return driver.getCurrentUrl().equals("https://mail.google.com/mail/u/0/#inbox");
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

    public void logout() {
        //waitForElementToBeVisible(userMenu);
       // userMenu.click();
        //waitForElementToBeVisible(logout);
        driver.findElement(By.className("gb_D gb_Na gb_i")).click();
        logout.click();
    }


}
