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

    public WebElement getAddDoctorButton() {
        return addDoctorButton;
    }
}
