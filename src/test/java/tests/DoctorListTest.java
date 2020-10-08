package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DoctorList;

public class DoctorListTest extends BaseTest {

    String URL = "http://localhost:8080/doctors/list";

    @Test(enabled = false)
    public void doctorListTest() {

        driver.get(URL);
        DoctorList doctorList = new DoctorList(driver);

        String expectedHeader = "Doctor list";
        Assert.assertEquals(doctorList.getDoctorListHeader().getText(), expectedHeader);

        Assert.assertTrue(doctorList.getMainMenuButton().isDisplayed());

        Assert.assertTrue(doctorList.getAddDoctorButton().isDisplayed());

        Assert.assertTrue(doctorList.getSearchTextInput().isDisplayed());

        String expectedPlaceholder = "First name or last name";
        Assert.assertEquals(doctorList.getSearchTextInput().getAttribute("placeholder"), expectedPlaceholder);

        Assert.assertTrue(doctorList.getSearchButton().isDisplayed());

        Assert.assertTrue(doctorList.getClearButton().isDisplayed());

        String[] expectedHeaders = {"First name", "Last name", "E-mail address", "Phone", "Details", "Delete"};

        for (int i = 0; i < doctorList.getDoctorListTableHeaders().size(); i++) {
            Assert.assertEquals(doctorList.getDoctorListTableHeaders().get(i).getText(), expectedHeaders[i]);
        }

        doctorList.getAddDoctorButton().click();
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:8080/doctors/new");
        driver.navigate().back();

        doctorList.getMainMenuButton().click();
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:8080/");

    }
}
