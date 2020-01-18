package com.automation.openmrs.tests;

import com.automation.openmrs.base.TestBase;
import com.automation.openmrs.po.LoginPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.By.id;

@Test
public class LoginTest extends TestBase {

        // TC1 - Verify valid error message displays  when USER NAME  field is BLANK
            @Test(priority = 0)
            public void invalidLoginBlankUserID() {
            LoginPage loginPage1 = new LoginPage(driver);
            loginPage1.txtUserName.clear();
            loginPage1.setUserID("");
            loginPage1.txtPassword.clear();
            loginPage1.setPassword("admin123");
            loginPage1.clickOnRegistrationDesk();
            loginPage1.clickOnLoginBtn();


            // Capture error message and store in variable
            String actual_msg=driver.findElement(id("error-message")).getText();
            String expect_msg="Invalid username/password. Please try again.";
            Assert.assertEquals(actual_msg, expect_msg);
            System.out.println("Valid error message displayed for blank user name" +actual_msg);

            WebDriverWait wait = new WebDriverWait (driver, 20);

        }

        // TC2 - Verify valid error message displays  when PASSWORD  field is BLANK
            @Test(priority = 1)
            public void invalidLoginBlankPassword() {
            LoginPage loginPage2 = new LoginPage(driver);
            loginPage2.txtUserName.clear();
            loginPage2.setUserID("Admin");
            loginPage2.txtPassword.clear();
            loginPage2.setPassword("");
            loginPage2.clickOnRegistrationDesk();
            loginPage2.clickOnLoginBtn();


            //Capture error message and store in variable
                String actual_msg=driver.findElement(id("error-message")).getText();
                String expect_msg="Invalid username/password. Please try again.";
                Assert.assertEquals(actual_msg, expect_msg);
                System.out.println("Valid error message displayed for blank password" +actual_msg);

                WebDriverWait wait = new WebDriverWait (driver, 20);
        }


        //TC3 -Verify valid error message displays  when PASSWORD AND USER NAME  fields ARE BLANK
            @Test(priority = 2)
            public void invalidLoginBlankUserNamePassword() {
            LoginPage loginPage3 = new LoginPage(driver);
            loginPage3.txtUserName.clear();
            loginPage3.setUserID("");
            loginPage3.txtPassword.clear();
            loginPage3.setPassword("");
            loginPage3.clickOnRegistrationDesk();
            loginPage3.clickOnLoginBtn();


                //Capture error message and store in variable
                String actual_msg=driver.findElement(id("error-message")).getText();
                String expect_msg="Invalid username/password. Please try again.";
                Assert.assertEquals(actual_msg, expect_msg);
                System.out.println("Valid error message displayed for blank user name and password" +actual_msg);

                WebDriverWait wait = new WebDriverWait (driver, 20);

        }

        //TC4 - Verify valid error message displays  when user enter  INVALID USER NAME
            @Test(priority = 3)
            public void invalidLoginInvalidUserName() {
            LoginPage loginPage4 = new LoginPage(driver);
            loginPage4.txtUserName.clear();
            loginPage4.setUserID("invaliduser");
            loginPage4.txtPassword.clear();
            loginPage4.setPassword("admin123 ");
            loginPage4.clickOnRegistrationDesk();
            loginPage4.clickOnLoginBtn();


                //Capture error message and store in variable
                String actual_msg=driver.findElement(id("error-message")).getText();
                String expect_msg="Invalid username/password. Please try again.";
                Assert.assertEquals(actual_msg, expect_msg);
                System.out.println("Valid error message displayed for invalidusername" +actual_msg);

                WebDriverWait wait = new WebDriverWait (driver, 20);


        }

        // TC5- Verify valid error message displays  when user enter  INVALID PASSWORD
            @Test(priority = 4)
            public void invalidLoginInvalidPassword() {
            LoginPage loginPage5 = new LoginPage(driver);
            loginPage5.txtUserName.clear();
            loginPage5.setUserID("Admin1");
            loginPage5.txtPassword.clear();
            loginPage5.setPassword("invalidpsw");
            loginPage5.clickOnRegistrationDesk();
            loginPage5.clickOnLoginBtn();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

                //Capture error message and store in variable
                String actual_msg=driver.findElement(id("error-message")).getText();
                String expect_msg="Invalid username/password. Please try again.";
                Assert.assertEquals(actual_msg, expect_msg);
                System.out.println("Valid error message displayed for invalidpsw" +actual_msg);

                WebDriverWait wait = new WebDriverWait (driver, 20);

        }


        //TC7- Login with valid credential
            @Test(priority = 5)
            public void validLogin() {
            LoginPage loginPage5 = new LoginPage(driver);
            loginPage5.txtUserName.clear();
            loginPage5.setUserID("Admin");
            loginPage5.txtPassword.clear();
            loginPage5.setPassword("Admin123");
            loginPage5.clickOnRegistrationDesk();
            loginPage5.clickOnLoginBtn();

            // Verify successfully logged in
            String actualUrl = "https://demo.openmrs.org/openmrs/referenceapplication/home.page";
            String expectedUrl = driver.getCurrentUrl();
            if (actualUrl.equalsIgnoreCase(expectedUrl)) {
                System.out.println("Successfully logged in");
            } else {
                System.out.println("Login Failed");
            }
    }
}





