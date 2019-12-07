package com.automation.openmrs.tests;
import com.automation.openmrs.base.TestBase;
import com.automation.openmrs.po.HomePage;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class HomeTest extends TestBase {

    @Test
    public void HomeTest() throws InterruptedException {
        // Create public void navigateToUrl(String url) { driver.get(url);} method to navigate to different pages.
        // Also, I have noticed that you have already used the below url in @BeforeSuite method.
        // If both are same then there is no need of below url.
        // -- HITESH
        driver.get("https://demo.openmrs.org/openmrs/referenceapplication/home.page");

        // Implicit wait should be defined in @BeforeSuite method. Since it's globally set for all
        // findElement methods
        // -- HITESH
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }


        // Method name should start with lowercase. Use pascal case. i.e. homePageLinks() -- HITESH
        @Test (priority = 1)
        public void homepagelinks() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnFindPatientRecordLink();
        homePage.clickOnHomeIcon();
        homePage.clickOnkActiveVisitsLink();
        homePage.clickOnHomeIcon();
        homePage.clickOnRegisterPatientLink();

        String actualUrl="https://demo.openmrs.org/openmrs/referenceapplication/home.page";
        String expectedUrl= driver.getCurrentUrl();

        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Test passed - Home page displayed ");
        }
        else
        {
            System.out.println("Test failed - Home page didn't display");
        }

    }
}
