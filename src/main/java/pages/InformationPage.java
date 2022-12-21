package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage {


    By EnterAccountInformationTitle = By.xpath("//b[text()='Enter Account Information']");
    By Name = By.id("name");
    By Email = By.id("email");
    By PassWord = By.id("password");
    By DateOfBirth_Years = By.id("years");
    By DateOfBirth_Months = By.id("months");
    By DateOfBirth_Days = By.id("days");
    By Checkbox_Newsletter = By.id("newsletter");
    By Checkbox_SpecialOffers = By.id("optin");
    By AddressInfo_FirstName = By.id("first_name");
    By AddressInfo_LastName = By.id("last_name");
    By Company = By.id("company");
    By Address1 = By.id("address1");
    By Address2 = By.id("address2");
    By Country = By.id("country");
    By State = By.id("state");
    By City = By.id("city");
    By ZipCode = By.id("zipcode");
    By Mobile_Number = By.id("mobile_number");
    By Create_Account = By.xpath("//*[@data-qa='create-account']");
    String URL = "https://automationexercise.com/login";

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }





    public By getEnterAccountInformationTitle() {
        return EnterAccountInformationTitle;
    }

    public void setEnterAccountInformationTitle(By enterAccountInformationTitle) {
        EnterAccountInformationTitle = enterAccountInformationTitle;
    }

    public By getName() {
        return Name;
    }

    public void setName(By name) {
        Name = name;
    }

    public By getEmail() {
        return Email;
    }

    public void setEmail(By email) {
        Email = email;
    }

    public By getPassWord() {
        return PassWord;
    }

    public void setPassWord(By passWord) {
        PassWord = passWord;
    }

    public By getDateOfBirth_Years() {
        return DateOfBirth_Years;
    }

    public void setDateOfBirth_Years(By dateOfBirth_Years) {
        DateOfBirth_Years = dateOfBirth_Years;
    }

    public By getDateOfBirth_Months() {
        return DateOfBirth_Months;
    }

    public void setDateOfBirth_Months(By dateOfBirth_Months) {
        DateOfBirth_Months = dateOfBirth_Months;
    }

    public By getDateOfBirth_Days() {
        return DateOfBirth_Days;
    }

    public void setDateOfBirth_Days(By dateOfBirth_Days) {
        DateOfBirth_Days = dateOfBirth_Days;
    }

    public By getCheckbox_Newsletter() {
        return Checkbox_Newsletter;
    }

    public void setCheckbox_Newsletter(By checkbox_Newsletter) {
        Checkbox_Newsletter = checkbox_Newsletter;
    }

    public By getCheckbox_SpecialOffers() {
        return Checkbox_SpecialOffers;
    }

    public void setCheckbox_SpecialOffers(By checkbox_SpecialOffers) {
        Checkbox_SpecialOffers = checkbox_SpecialOffers;
    }

    public By getAddressInfo_FirstName() {
        return AddressInfo_FirstName;
    }

    public void setAddressInfo_FirstName(By addressInfo_FirstName) {
        AddressInfo_FirstName = addressInfo_FirstName;
    }

    public By getAddressInfo_LastName() {
        return AddressInfo_LastName;
    }

    public void setAddressInfo_LastName(By addressInfo_LastName) {
        AddressInfo_LastName = addressInfo_LastName;
    }

    public By getCompany() {
        return Company;
    }

    public void setCompany(By company) {
        Company = company;
    }

    public By getAddress1() {
        return Address1;
    }

    public void setAddress1(By address1) {
        Address1 = address1;
    }

    public By getAddress2() {
        return Address2;
    }

    public void setAddress2(By address2) {
        Address2 = address2;
    }

    public By getCountry() {
        return Country;
    }

    public void setCountry(By country) {
        Country = country;
    }

    public By getState() {
        return State;
    }

    public void setState(By state) {
        State = state;
    }

    public By getCity() {
        return City;
    }

    public void setCity(By city) {
        City = city;
    }

    public By getZipCode() {
        return ZipCode;
    }

    public void setZipCode(By zipCode) {
        ZipCode = zipCode;
    }

    public By getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_Number(By mobile_Number) {
        Mobile_Number = mobile_Number;
    }

    public By getCreate_Account() {
        return Create_Account;
    }

    public void setCreate_Account(By create_Account) {
        Create_Account = create_Account;
    }


}
