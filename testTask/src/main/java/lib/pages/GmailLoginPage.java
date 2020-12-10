package lib.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage extends BasePage{

    @FindBy(name = "identifier")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(className = "gb_ue gb_qc gb_se")
    private WebElement inboxLogo;

    public GmailLoginPage(WebDriver driver) {
        super(driver);
    }

    public GmailPage login(String username, String password) throws InterruptedException {
        usernameField.sendKeys(username);
        usernameField.sendKeys(Keys.RETURN);
        waitForElementToBeVisible(passwordField);
        //Thread.sleep(5000);
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
