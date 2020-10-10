package utils;

import tests.MainMenuTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

    public static void readPropertiesFile() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("src/test/resources/test.properties");
        properties.load(inputStream);

        MainMenuTest.URL = properties.getProperty("URL");
        MainMenuTest.screenshotPath = properties.getProperty("screenshot_path");

    }

}
