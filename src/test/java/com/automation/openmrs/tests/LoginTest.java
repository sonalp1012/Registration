package com.automation.openmrs.tests;
import com.automation.openmrs.base.TestBase;
import com.automation.openmrs.po.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.By.*;

public class LoginTest extends TestBase {

    @Test
    public void LoginTest() throws InterruptedException {

        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
    }

        // TC1 - Verify valid error message displays  when USER NAME  field is BLANK
            @Test(priority = 0)
            public void invalidLogin_BlankUserID() {
            LoginPage loginPage1 = new LoginPage(driver);
            loginPage1.txtUserName.clear();
            loginPage1.setUserID("");
            loginPage1.txtPassword.clear();
            loginPage1.setPassword("admin123");
            loginPage1.clickOnRegistrationDesk();
            loginPage1.clickOnLoginBtn();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            //WebDriverWait wait = new WebDriverWait(driver,60);
            //wait.until(ExpectedConditions.textToBePresentInElement(By.id("error-message"), "Invalid username/password. Please try again."));

            // Capture error message and store in variable
            String actual_msg=driver.findElement(id("error-message")).getText();
            String expect_msg="Invalid username/password. Please try again.";
            Assert.assertEquals(actual_msg, expect_msg);
            System.out.println("Valid error message displayed for blank user name" +actual_msg);

        }

        // TC2 - Verify valid error message displays  when PASSWORD  field is BLANK
            @Test(priority = 1)
            public void invalidLogin_BlankPassword() {
            LoginPage loginPage2 = new LoginPage(driver);
            loginPage2.txtUserName.clear();
            loginPage2.setUserID("Admin");
            loginPage2.txtPassword.clear();
            loginPage2.setPassword("");
            loginPage2.clickOnRegistrationDesk();
            loginPage2.clickOnLoginBtn();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            //Capture error message and store in variable
                String actual_msg=driver.findElement(id("error-message")).getText();
                String expect_msg="Invalid username/password. Please try again.";
                Assert.assertEquals(actual_msg, expect_msg);
                System.out.println("Valid error message displayed for blank password" +actual_msg);
        }


        //TC3 -Verify valid error message displays  when PASSWORD AND USER NAME  fields ARE BLANK
            @Test(priority = 2)
            public void invalidLogin_BlankUserNamePassword() {
            LoginPage loginPage3 = new LoginPage(driver);
            loginPage3.txtUserName.clear();
            loginPage3.setUserID("");
            loginPage3.txtPassword.clear();
            loginPage3.setPassword("");
            loginPage3.clickOnRegistrationDesk();
            loginPage3.clickOnLoginBtn();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

                //Capture error message and store in variable
                String actual_msg=driver.findElement(id("error-message")).getText();
                String expect_msg="Invalid username/password. Please try again.";
                Assert.assertEquals(actual_msg, expect_msg);
                System.out.println("Valid error message displayed for blank user name and password" +actual_msg);

        }

        //TC4 - Verify valid error message displays  when user enter  INVALID USER NAME
            @Test(priority = 3)
            public void invalidLogin_InvalidUserName() {
            LoginPage loginPage4 = new LoginPage(driver);
            loginPage4.txtUserName.clear();
            loginPage4.setUserID("invaliduser");
            loginPage4.txtPassword.clear();
            loginPage4.setPassword("admin123 ");
            loginPage4.clickOnRegistrationDesk();
            loginPage4.clickOnLoginBtn();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

                //Capture error message and store in variable
                String actual_msg=driver.findElement(id("error-message")).getText();
                String expect_msg="Invalid username/password. Please try again.";
                Assert.assertEquals(actual_msg, expect_msg);
                System.out.println("Valid error message displayed for invalidusername" +actual_msg);

        }

        // TC5- Verify valid error message displays  when user enter  INVALID PASSWORD
            @Test(priority = 4)
            public void invalidLogin_InvalidPassword() {
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

        }


        //TC7- Login with valid credential
            @Test(priority = 4)
            public void validLogin() {
            LoginPage loginPage5 = new LoginPage(driver);
            loginPage5.txtUserName.clear();
            loginPage5.setUserID("Admin");
            loginPage5.txtPassword.clear();
            loginPage5.setPassword("Admin123");
            loginPage5.clickOnRegistrationDesk();
            loginPage5.clickOnLoginBtn();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

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





