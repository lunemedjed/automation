package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GooglePage extends BasePage{

    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class = 'g']//a")
    private WebElement firstResult;


    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void search (String searchTerm) {
        searchField.click();
        searchField.sendKeys(searchTerm);
        searchField.submit();
    }

    public boolean isFirst() {
        System.out.println(firstResult.getAttribute("href"));
        return firstResult.getAttribute("href").equals("https://www.mitto.ch/");

    }



}
