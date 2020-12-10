package lib.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage extends BasePage{

    @FindBy(id = "identifierId")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;


    public GmailLoginPage(WebDriver driver) {
        super(driver);
    }

    public GmailPage login(String username, String password) throws InterruptedException {
        waitForElementToBeVisible(usernameField);
        usernameField.sendKeys(username);
        usernameField.sendKeys(Keys.RETURN);
        waitForElementToBeVisible(passwordField);
        passwordField.sendKeys(password);
        passwordField.sendKeys((Keys.RETURN));
        Thread.sleep(5000);
        return new GmailPage(driver);

    }

    //public boolean isLoggedIn () {
    //    waitForElementToBeVisible(inboxLogo);
    //    return inboxLogo.getAttribute("href").equals("#inbox");
    //}


}
