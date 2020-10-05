package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class MainMenuTest extends BaseTest {

    @Test
    public void mainMenuTest() {

        driver.get("http://localhost:8080/");
        HomePage homePage = new HomePage(driver);

    }
}
