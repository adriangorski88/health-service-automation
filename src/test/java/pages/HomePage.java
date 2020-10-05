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

    @FindBy(linkText = "Doctor list")
    private WebElement doctorListLink;

    @FindBy(linkText = "Hospital list")
    private WebElement hospitalListLink;

    @FindBy(linkText = "Contract list")
    private WebElement contractListLink;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getWelcomeHeader() {
        return welcomeHeader;
    }

    public WebElement getMainMenuHeader() {
        return mainMenuHeader;
    }

    public void clickDoctorListButton() {
        doctorListLink.click();
    }

    public void clickHospitalListButton() {
        hospitalListLink.click();
    }

    public void  clickContractListButton() {
        contractListLink.click();
    }
}
