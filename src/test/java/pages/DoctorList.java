package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DoctorList {

    @FindBy(tagName = "h3")
    private WebElement doctorListHeader;

    @FindBy(linkText = "Main menu")
    private WebElement mainMenuButton;

    @FindBy(linkText = "Add doctor")
    private WebElement addDoctorButton;

    @FindBy(id = "search")
    private WebElement searchTextInput;

    @FindBy(xpath = "//i[contains(text(), 'Search')]")
    private WebElement searchButton;

    @FindBy(linkText = "Clear")
    private WebElement clearButton;

    @FindBy(xpath = "//table/thead/tr[1]/th")
    private List<WebElement> doctorListTableHeaders;

    @FindBy(xpath = "//table/tbody/tr/td[1]")
    private WebElement doctorListTableFirstRowFirstColumn;

    @FindBy(xpath = "//tbody")
    private WebElement doctorListTableBody;

    public DoctorList(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getDoctorListHeader() {
        return doctorListHeader;
    }

    public WebElement getMainMenuButton() {
        return mainMenuButton;
    }

    public WebElement getAddDoctorButton() {
        return addDoctorButton;
    }

    public WebElement getSearchTextInput() {
        return searchTextInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getClearButton() {
        return clearButton;
    }

    public List<WebElement> getDoctorListTableHeaders() {
        return doctorListTableHeaders;
    }

    public WebElement getDoctorListTableFirstRowFirstColumn() {
        return doctorListTableFirstRowFirstColumn;
    }

    public WebElement getDoctorListTableBody() {
        return doctorListTableBody;
    }
}
