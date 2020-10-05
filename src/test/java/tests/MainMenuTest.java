package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class MainMenuTest extends BaseTest {

    String URL = "http://localhost:8080/";

    @Test
    public void mainMenuTest() {

        driver.get(URL);
        HomePage homePage = new HomePage(driver);

        String expectedWelcomeHeader = "Welcome to Health Service";
        Assert.assertEquals(homePage.getWelcomeHeader().getText(), expectedWelcomeHeader);

        String expectedMainMenuHeader = "Main menu";
        Assert.assertEquals(homePage.getMainMenuHeader().getText(), expectedMainMenuHeader);

        homePage.clickDoctorListButton();
        String doctorListHeader = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(doctorListHeader, "Doctor list");

        driver.navigate().back();

        homePage.clickHospitalListButton();
        String hospitalListHeader = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(hospitalListHeader, "Hospital list");

        driver.navigate().back();

        homePage.clickContractListButton();
        String contractListHeader = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(contractListHeader, "Contract list");

        driver.navigate().back();

    }
}
