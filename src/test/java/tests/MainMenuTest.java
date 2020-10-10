package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.PropertiesFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainMenuTest extends BaseTest {

    public static String URL;

    public static void takeScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date());
        File destinationFile = new File(System.getProperty("user.dir") +
                "\\src\\test\\resources\\screenshots\\" + timestamp + ".png");
        Files.copy(screenshotFile.toPath(), destinationFile.toPath());
    }

    @Test
    public void mainMenuTest() throws IOException {

        PropertiesFile.readPropertiesFile();
        driver.get(URL);
        takeScreenshot(driver);
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
