package test;

import helper.ActionsHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountCreated;
import pages.HomePage;
import pages.InformationPage;
import pages.SignUpPage;

import java.time.Duration;

public class TC04 {

    WebDriver driver;
    HomePage homePage;
    InformationPage informationPage;
    SignUpPage signUpPage;
    AccountCreated accountCreated;
    String email = "narldinfnbvznn.fawzy@vodafone.com";
    String homePageURL = "https://automationexercise.com/";

    @BeforeClass
    public void init() {

        driver = new ChromeDriver();
        informationPage = new InformationPage();
        accountCreated = new AccountCreated();
        homePage = new HomePage();
        signUpPage = new SignUpPage();
        driver.get(informationPage.getURL());
    }


    @Test(priority = 0)
    public void Signup() {


        String signUpName = ActionsHelpers.sendKeysAction("nardine", signUpPage.getSignUp_Name(), driver);
        Assert.assertEquals(signUpName, "nardine");
        String signUpEmail = ActionsHelpers.sendKeysAction(email, signUpPage.getSignUp_Email(), driver);
        Assert.assertEquals(signUpEmail, email);
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3));
        wt.until(ExpectedConditions.elementToBeClickable(signUpPage.getSignUp_btn()));
        driver.findElement(signUpPage.getSignUp_btn()).click();
    }

    @Test(priority = 1)
    public void SignUP() {


        String password = ActionsHelpers.sendKeysAction("123456", informationPage.getPassWord(), driver);
        Assert.assertEquals(password, "123456");

        String dateOfBirth_Years = ActionsHelpers.selectDropDownAction("1995", informationPage.getDateOfBirth_Years(), driver);
        Assert.assertEquals(dateOfBirth_Years, "1995");

        String dateOfBirth_Months = ActionsHelpers.selectDropDownAction("March", informationPage.getDateOfBirth_Months(), driver);
        Assert.assertEquals(dateOfBirth_Months, "March");

        String dateOfBirth_Days = ActionsHelpers.selectDropDownAction("7", informationPage.getDateOfBirth_Days(), driver);
        Assert.assertEquals(dateOfBirth_Days, "7");

        Boolean checkbox_Newsletter = ActionsHelpers.clickAction(informationPage.getCheckbox_Newsletter(), driver);
        Assert.assertTrue(checkbox_Newsletter);

        Boolean Checkbox_SpecialOffers = ActionsHelpers.clickAction(informationPage.getCheckbox_SpecialOffers(), driver);
        Assert.assertTrue(Checkbox_SpecialOffers);


        String firstname = ActionsHelpers.sendKeysAction("nardine", informationPage.getAddressInfo_FirstName(), driver);
        Assert.assertEquals(firstname, "nardine");

        String lastname = ActionsHelpers.sendKeysAction("helal", informationPage.getAddressInfo_LastName(), driver);
        Assert.assertEquals(lastname, "helal");

        String company = ActionsHelpers.sendKeysAction("VOIS", informationPage.getCompany(), driver);
        Assert.assertEquals(company, "VOIS");


        String Address1 = ActionsHelpers.sendKeysAction("Helwan Al Zeraay, New Maadi , VOIS ", informationPage.getAddress1(), driver);
        Assert.assertEquals(Address1, "Helwan Al Zeraay, New Maadi , VOIS ");


        String secondAddress = ActionsHelpers.sendKeysAction("Misr El Gdeda , Omar Ibn El Khttab", informationPage.getAddress2(), driver);
        Assert.assertEquals(secondAddress, "Misr El Gdeda , Omar Ibn El Khttab");


        String country = ActionsHelpers.sendKeysAction("India", informationPage.getCountry(), driver);
        Assert.assertEquals(country, "India");

        String state = ActionsHelpers.sendKeysAction("Manipur", informationPage.getState(), driver);
        Assert.assertEquals(state, "Manipur");

        String city = ActionsHelpers.sendKeysAction("Imphal", informationPage.getCity(), driver);
        Assert.assertEquals(city, "Imphal");


        String zipcode = ActionsHelpers.sendKeysAction("795002", informationPage.getZipCode(), driver);
        Assert.assertEquals(zipcode, "795002");


        String mobileNumber = ActionsHelpers.sendKeysAction("+91 7947141986", informationPage.getMobile_Number(), driver);
        Assert.assertEquals(mobileNumber, "+91 7947141986");

        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3));
        wt.until(ExpectedConditions.elementToBeClickable(informationPage.getCreate_Account())).click();


    }

    @Test(priority = 2)
    public void AccountCreatedPageTitle() {
        String AccountCreatedText = ActionsHelpers.getText(accountCreated.getAccountCreated(), driver);
        Assert.assertEquals("ACCOUNT CREATED!", AccountCreatedText);
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3));
        wt.until(ExpectedConditions.elementToBeClickable(accountCreated.getContinue())).click();

    }

         @Test(priority = 3)
            public void visibleHomePage() {

            String featuresItems = ActionsHelpers.getText(homePage.getFeaturesItems(),driver);
            Assert.assertEquals("FEATURES ITEMS",featuresItems);
}
        @Test(priority = 4)
            public void logOut() {
            WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(120));
            wt.until(ExpectedConditions.elementToBeClickable(homePage.getLogOutBtn()));
            driver.findElement(homePage.getLogOutBtn()).click();
        }
        @Test(priority = 5)
        public void existemail() {


        String signUpName = ActionsHelpers.sendKeysAction("nardine", signUpPage.getSignUp_Name() , driver);
        Assert.assertEquals(signUpName , "nardine");
        String signUpEmail = ActionsHelpers.sendKeysAction(email, signUpPage.getSignUp_Email() , driver);
        Assert.assertEquals(signUpEmail, email);
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3));
        wt.until(ExpectedConditions.elementToBeClickable (signUpPage.getSignUp_btn()));
        driver.findElement(signUpPage.getSignUp_btn()).click();
        String getExistemailText = driver.findElement(signUpPage.getExistemail()).getText();
        Assert.assertEquals("Email Address already exist!" , getExistemailText);
    }


}