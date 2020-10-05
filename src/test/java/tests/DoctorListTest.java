package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DoctorList;

public class DoctorListTest extends BaseTest {

    String URL = "http://localhost:8080/doctors/list";

    @Test
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


    }
}
