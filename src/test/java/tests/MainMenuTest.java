package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.PropertiesFile;

import java.io.IOException;

import static helpers.Screenshot.takeScreenshot;
import static org.testng.Assert.assertEquals;

public class MainMenuTest extends BaseTest {

    public static String URL;

    @Test
    public void mainMenuTest() throws IOException {

        PropertiesFile.readPropertiesFile();
        driver.get(URL);
        takeScreenshot(driver);
        HomePage homePage = new HomePage(driver);

        String expectedWelcomeHeader = "Welcome to Health Service";
        assertEquals(homePage.getWelcomeHeader().getText(), expectedWelcomeHeader);

        String expectedMainMenuHeader = "Main menu";
        assertEquals(homePage.getMainMenuHeader().getText(), expectedMainMenuHeader);

        homePage.clickDoctorListButton();
        String doctorListHeader = driver.findElement(By.tagName("h3")).getText();
        assertEquals(doctorListHeader, "Doctor list");

        driver.navigate().back();

        homePage.clickHospitalListButton();
        String hospitalListHeader = driver.findElement(By.tagName("h3")).getText();
        assertEquals(hospitalListHeader, "Hospital list");

        driver.navigate().back();

        homePage.clickContractListButton();
        String contractListHeader = driver.findElement(By.tagName("h3")).getText();
        assertEquals(contractListHeader, "Contract list");

        driver.navigate().back();

    }
}
