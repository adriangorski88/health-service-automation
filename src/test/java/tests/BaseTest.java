package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertiesFile;

import java.io.IOException;

public class BaseTest {

    WebDriver driver;
    public static String browser;

    @BeforeMethod
    public void setUp() throws IOException {

        PropertiesFile.readPropertiesFile();
        String driverPath;

        switch (browser) {
            case "firefox":
                driverPath = "src/test/resources/executables/drivers/geckodriver.exe";
                System.setProperty("webdriver.gecko.driver", driverPath);
                driver = new FirefoxDriver();
                break;

            case "chrome":
                driverPath = "src/test/resources/executables/drivers/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", driverPath);
                driver = new ChromeDriver();

            case "edge":
                driverPath = "src/test/resources/executables/drivers/msedgedriver.exe";
                System.setProperty("webdriver.edge.driver", driverPath);
                driver = new EdgeDriver();

            default: {
                System.out.println("Default webdriver");
            }
        }

        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
