package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(tagName = "h1")
    private WebElement welcomeHeader;

    @FindBy(tagName = "h2")
    private WebElement mainMenuHeader;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
