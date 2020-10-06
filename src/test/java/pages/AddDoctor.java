package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDoctor {

    @FindBy(id = "firstName")
    private WebElement firstNameTextField;

    @FindBy(id = "lastName")
    private WebElement lastNameTextField;

    @FindBy(id = "birthDate")
    private WebElement birthDateTextField;

    @FindBy(id = "country")
    private WebElement countryDropDownList;

    @FindBy(xpath = "/html/body/div/div/div/div/form/div/div[1]/span")
    private WebElement firstNameSpan;

    @FindBy(xpath = "/html/body/div/div/div/div/form/div/div[2]/span")
    private WebElement lastNameSpan;

    @FindBy(xpath = "/html/body/div/div/div/div/form/div/div[4]/span")
    private WebElement countrySpan;

    @FindBy(xpath = "//input[@value = 'Add doctor']")
    private WebElement addDoctorButton;

    public AddDoctor(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirstNameTextField() {
        return firstNameTextField;
    }

    public WebElement getLastNameTextField() {
        return lastNameTextField;
    }

    public WebElement getBirthDateTextField() {
        return birthDateTextField;
    }

    public WebElement getCountryDropDownList() {
        return countryDropDownList;
    }

    public WebElement getFirstNameSpan() {
        return firstNameSpan;
    }

    public WebElement getLastNameSpan() {
        return lastNameSpan;
    }

    public WebElement getCountrySpan() {
        return countrySpan;
    }

    public WebElement getAddDoctorButton() {
        return addDoctorButton;
    }
}
