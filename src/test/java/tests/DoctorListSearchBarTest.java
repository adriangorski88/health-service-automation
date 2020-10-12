package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DoctorList;
import utils.PropertiesFile;

import java.io.IOException;

public class DoctorListSearchBarTest extends BaseTest {

    public static String URL;
    String endpoint = "/doctors/list";

    @Test(priority = 2)
    public void doctorListSearchBarTest() throws IOException {

        PropertiesFile.readPropertiesFile();
        driver.get(URL + endpoint);

        DoctorList doctorList = new DoctorList(driver);

        String searchKeyword = "Gregory";
        doctorList.getSearchTextInput().sendKeys(searchKeyword);
        Assert.assertEquals(doctorList.getSearchTextInput().getAttribute("value"), searchKeyword);

        doctorList.getSearchButton().click();
        Assert.assertEquals(doctorList.getDoctorListTableFirstRowFirstColumn().getText(), searchKeyword);

        doctorList.getClearButton().click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, URL + endpoint);

        doctorList.getSearchTextInput().sendKeys(searchKeyword);
        Assert.assertEquals(doctorList.getSearchTextInput().getAttribute("value"), searchKeyword);

        doctorList.getSearchTextInput().sendKeys(Keys.ENTER);
        Assert.assertEquals(doctorList.getDoctorListTableFirstRowFirstColumn().getText(), searchKeyword);

        doctorList.getClearButton().click();
        Assert.assertEquals(currentUrl, URL + endpoint);

        Assert.assertEquals(doctorList.getSearchTextInput().getAttribute("value"), "");
        doctorList.getSearchButton().click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "http://localhost:8080/doctors/list?keyword=");

        searchKeyword = "asdasdasd";
        doctorList.getSearchTextInput().sendKeys(searchKeyword);
        doctorList.getSearchButton().click();
        Assert.assertEquals(doctorList.getDoctorListTableBody().getText(),"");
        doctorList.getClearButton().click();

    }
}
