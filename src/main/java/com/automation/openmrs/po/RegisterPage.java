package com.automation.openmrs.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    //Create Construction
    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "Name")
    public WebElement linkNameLable; // Please consider typos as well. -- HITESH

    @FindBy(name = "givenName")
    public WebElement textGiveName;

    @FindBy(name = "middleName")
    public WebElement textMiddleName;

    @FindBy(name = "familyName")
    public WebElement textFamilyName;

    @FindBy(id = "genderLabel")
    public WebElement linkGenderLabel;

    @FindBy(name = "gender")
    public WebElement linkGender; //should be link or tagname ?

    @FindBy(id = "birthdateLabel")
    public WebElement linkBirthdateLabel;

    @FindBy(id = "birthdateDay-field")
    public WebElement txtBirthDay;

    @FindBy(id = "birthdateMonth")
    public WebElement linkBirthdateMonth; // should be link or tagname ?

    @FindBy(id = "birthdateYear-field")
    public WebElement txtBirhdateYear;

    @FindBy(className = "question-legend focused")
    public WebElement linkAddressLabel;

    @FindBy(id = "address1")
    public WebElement textAddress1;

    @FindBy(id = "cityVillage")
    public WebElement textCityVillage;

    @FindBy(id = "stateProvince")
    public WebElement textStateProvince;

    @FindBy(id = "country")
    public WebElement textCountry;

    @FindBy(id = "postalCode")
    public WebElement textpostalCode; // Variable name should start with lowercase. Use pascal case. i.e. textPostalCode -- HITESH

    @FindBy(id = "phoneNumberLabel")
    public WebElement linkPhoneNumberLabel;

    @FindBy(id = "phoneNumber")
    public WebElement textPhoneNumber;

    @FindBy(id = "confirmation_label")
    public WebElement linkConfirmationLabel;

    @FindBy(id = "submit")
    public WebElement linksubmitbtn; // Variable name should start with lowercase. Use pascal case. i.e. linkSubmitBtn -- HITESH

    //@Hitesh can I put  set of Method e.g Click -in one method/ Set- in one method?
    /*
    You can. But it completely depends on how you are planning to use it. Just like "Login" example
    I used to give you on this. It's upto you. Just make sure you don't end up adding so many methods.

    Make it meaningful. -- HITESH
     */


    // Register a Patient - Methods
    public void clickOnNameLink() {
        linkNameLable.click();
    }
    public void setGivenName(String givenName) {
        textGiveName.sendKeys(givenName);
    }

    // Typos correction in below Method - HITESH
    public void setMidddleName(String middleName) {
        textMiddleName.sendKeys(middleName);
    }
    public void setFamilyName(String familyNameName) {
        textFamilyName.sendKeys(familyNameName);
    }
    public void clickOnGenderLable() {
        linkGenderLabel.click();
    }
    public void clickGender() {linkGender.click();}

    // Typo correction in below method - HITESH
    public void clickOnBirthdateLable(){ linkBirthdateLabel.click(); }
    public void setBirthDay(String birthDay){
        txtBirthDay.sendKeys();
    }
    public void clickBirthdateMonth(String birthdateMonth){
        Select birthdateMonth1 = new Select(linkBirthdateMonth);
        birthdateMonth1.selectByVisibleText(birthdateMonth);
    }

    // Typo correction In below method - HITESH
    public void setBirhdateYear(String birthdateYear){
        txtBirhdateYear.sendKeys();
    }

    // Method name should start with lowercase. Use pascal case. i.e. clickAddressLabel() -- HITESH
    public void clickAddresslabel(){
        linkAddressLabel.click();
    }
    public void setAddress1(String address1){ textAddress1.sendKeys(); }
    public void setCityVillage(String cityVillage){
        textCityVillage.sendKeys();
    }
    public void setStateProvince(String stateProvince){ textStateProvince.sendKeys(); }
    public void setCountry(String country){ textCountry.sendKeys(); }
    public void setPostalCode(String postalCode){ textpostalCode.sendKeys(); }
    public void clickPhoneNumberLabel(){ linkPhoneNumberLabel.click(); }
    public void setPhoneNumber(){
        textPhoneNumber.sendKeys();
    }
    public void clickConfirmationLabel(){
        linkConfirmationLabel.click();
    }

    // Method name should start with lowercase. Use pascal case. i.e. clickSubmitBtn() -- HITESH
    public void clickSubmitbtn(){
        linksubmitbtn.click();
    }


}


