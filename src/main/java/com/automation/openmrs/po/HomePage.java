package com.automation.openmrs.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    // create constructor
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Find Patient Record")
    public WebElement linkFindPatientRecord;

    @FindBy(linkText = "Active Visits")
    public WebElement linkActiveVisits;

    @FindBy(linkText = "Register a patient")
    public WebElement linkRegisterAPatient;

    @FindBy(className = "icon-home small")
    public WebElement linkHomeIcon;

    @FindBy(id = "loginButton")
    public WebElement loginBtn;

    //Create method for Home page objects
    public void clickOnFindPatientRecordLink() { linkFindPatientRecord.click(); }
    public void clickOnkActiveVisitsLink() { linkActiveVisits.click(); }
    public void clickOnRegisterAPatient() { linkRegisterAPatient.click(); }
    public void clickOnHomeIcon() {linkHomeIcon.click();}
    public void clickOnLoginBtn() {loginBtn.click();}
}


