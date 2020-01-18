package com.automation.openmrs.tests;
import com.automation.openmrs.base.TestBase;
import com.automation.openmrs.po.HomePage;
import org.testng.annotations.Test;

@Test
public class HomeTest extends TestBase {

         // @Hitesh : called method "Login" from LoginTest but it is not working
         @Test (priority = 0)
         public void login() {
         LoginTest lg = new LoginTest();
         lg.validLogin();
    }

        @Test (priority = 1)
        public void homePageLinks() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnFindPatientRecordLink();
        homePage.clickOnHomeIcon();
        homePage.clickOnkActiveVisitsLink();
        homePage.clickOnHomeIcon();
        homePage.clickOnRegisterAPatient();

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
