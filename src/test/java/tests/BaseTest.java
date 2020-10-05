package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() {

        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Google Drive\\FILES\\TRENING\\MZ\\12\\Selenium\\src\\test\\resources\\executables\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",driverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        //driver.quit();
    }
}
