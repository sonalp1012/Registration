package com.automation.openmrs.base;

import com.automation.openmrs.utility.SystemUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public static final String BASE_DIRECTORY = SystemUtility.getUserDirectory();
    public WebDriver driver;


    @BeforeSuite
    public void Initialize() {
        try {

            // Set Chrome Driver Property
            System.setProperty("webdriver.chrome.driver", BASE_DIRECTORY+ "/src/driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.openmrs.org/openmrs/login.htm");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @AfterSuite
    public void TearDown() {
        try {

            driver.quit();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


