import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class BaseTest {

    @Test
    public void openHealthServiceWebApp() {

        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Google Drive\\FILES\\TRENING\\MZ\\12\\Selenium\\src\\test\\resources\\executables\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",driverPath);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8080/");
    }
}
