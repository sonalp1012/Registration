package com.automation.openmrs.po;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "username")
    public WebElement txtUserName;

    @FindBy (name = "password")
    public WebElement txtPassword;

    @FindBy (id = "Registration Desk")
    public WebElement linkRegistrationDesk;

    @FindBy (id = "loginButton")
    public WebElement btnLogin;


    //create method for login objects
    public void setUserID(String userID){
        txtUserName.clear();
        txtUserName.sendKeys(userID);
    }
    public void setPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }
    public void clickOnRegistrationDesk() {
        linkRegistrationDesk.click();
    }
    public void clickOnLoginBtn() {
        btnLogin.click();
    }


}


