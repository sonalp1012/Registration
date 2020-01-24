package com.automation.openmrs.tests;
import com.automation.openmrs.base.TestBase;
import com.automation.openmrs.po.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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



        // Navigate to Particular Module using Logic
            // Create ModuleUtility {
            // public void navigateToTestNg() {
            //  Get List Of all the elements driver.findElement(by.id("navbar")).findElements(by.tagName("a");
            // for(Element e : elements) { if(e.getText().trime().toUpperCase().equals("TESTNG") {e.click()} }
            //    }
            // }

        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Test passed - Home page displayed ");
        }
        else
        {
            System.out.println("Test failed - Home page didn't display");
        }

    }

    public void enterUserName(String userName) {
             WebElement e = driver.findElement(By.id(""));
             e.clear();
             e.sendKeys(userName);
    }
}
