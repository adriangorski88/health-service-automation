package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.AddDoctor;
import pages.DoctorList;

public class AddDoctorBlankValuesTest extends BaseTest {

    String URL = "http://localhost:8080/doctors/list";

    @Test
    public void addDoctorBlankValuesTest()  {

        driver.get(URL);
        DoctorList doctorList = new DoctorList(driver);
        AddDoctor addDoctor = new AddDoctor(driver);

        doctorList.getAddDoctorButton().click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "http://localhost:8080/doctors/new");

        Assert.assertEquals(addDoctor.getFirstNameTextField().getAttribute("value"), "");
        Assert.assertEquals(addDoctor.getLastNameTextField().getAttribute("value"), "");
        Assert.assertEquals(addDoctor.getCountryDropDownList().getAttribute("value"), "");

        addDoctor.getAddDoctorButton().click();

        Assert.assertEquals(addDoctor.getFirstNameSpan().getText(), "First name field cannot be blank.");
        Assert.assertEquals(addDoctor.getLastNameSpan().getText(), "Last name field cannot be blank.");
        Assert.assertEquals(addDoctor.getCountrySpan().getText(), "Select country.");

    }
}
