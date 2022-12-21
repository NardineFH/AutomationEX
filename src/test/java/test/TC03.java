package test;

import helper.ActionsHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.InformationPage;
import pages.SignUpPage;

import java.time.Duration;

public class TC03 {

    WebDriver driver;


    InformationPage informationPage ;
    SignUpPage signUpPage;

    String email = "wrongemail@email.com";

    @BeforeClass
    public  void init (){

        driver = new ChromeDriver();
        informationPage = new InformationPage();
        signUpPage = new SignUpPage ();
        driver.get(informationPage.getURL());



    }

    @Test(priority = 0)
    public void wrongpass() {


        String login_Email = ActionsHelpers.sendKeysAction(email, signUpPage.getLogin_Email(), driver);
        Assert.assertEquals(login_Email, email);
        String login_password = ActionsHelpers.sendKeysAction("123456", signUpPage.getLogin_password(), driver);
        Assert.assertEquals(login_password, "123456");
        String loginText = ActionsHelpers.getText(signUpPage.getLoginText(), driver);
        Assert.assertEquals("Login to your account", loginText);
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(15));
        wt.until(ExpectedConditions.elementToBeClickable(signUpPage.getLoginBtn())).click();
        String getWrongPassText = driver.findElement(signUpPage.getWorngpassText()).getText();
        Assert.assertEquals("Your email or password is incorrect!" , getWrongPassText);


    }

}
