package com.automation.openmrs.tests;

import com.automation.openmrs.base.TestBase;
import com.automation.openmrs.po.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    @Test
    public void RegisterTest() throws InterruptedException {
        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        //RegisterAPatient
        RegisterPage registerAPatientPage = new RegisterPage(driver);
        //registerAPatientPage.clickOnNameLink(); //Name link Already selected
        registerAPatientPage.setGivenName("John");
        registerAPatientPage.setMiddleName("A");
        registerAPatientPage.setFamilyName("Smith");
        registerAPatientPage.clickOnGenderLabel();
        registerAPatientPage.clickGender(); // how do i select Gender value "selectbyvisible text?
        registerAPatientPage.clickConfirmationLabel();
        registerAPatientPage.setBirthDay("01");
        registerAPatientPage.clickBirthdateMonth("January"); //how do i select Gender value

        registerAPatientPage.setBirthdateYear("1975");
        registerAPatientPage.clickAddressLabel();
        registerAPatientPage.setAddress1("100 Ocean street");
        registerAPatientPage.setCityVillage("JerseryCity");
        registerAPatientPage.setStateProvince("NJ");
        registerAPatientPage.setCountry("USA");
        registerAPatientPage.setPostalCode("12345");
        registerAPatientPage.clickPhoneNumberLabel();
        //registerAPatientPage.setPhoneNumber("gffjg");  // ?
        registerAPatientPage.clickConfirmationLabel();
        registerAPatientPage.clickSubmitBtn();
    }
}
