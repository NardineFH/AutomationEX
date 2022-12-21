package test;

import helper.ActionsHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TC12 {
    WebDriver driver;
    HomePage homePage;
    InformationPage informationPage ;
    SignUpPage signUpPage;
    AccountCreated accountCreated;
    ProductPage productPage;

    CartPage cartPage;

    @BeforeClass
    public  void init (){

        driver = new ChromeDriver();
        informationPage = new InformationPage();
        signUpPage = new SignUpPage ();
        homePage = new HomePage();
        accountCreated = new AccountCreated();
        productPage = new ProductPage();
        cartPage = new CartPage();
        driver.get(informationPage.getURL());
    }
    @Test
    public void clickONproductsBtn()
    {
        String productsBtn = ActionsHelpers.getText(homePage.getProductsBTN(),driver);
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3));
        wt.until(ExpectedConditions.elementToBeClickable (homePage.getProductsBTN())).click();


    }
    @Test (dependsOnMethods = "clickONproductsBtn")
    public void HoverToElement ()
    {   String product1Name ;
        String product2Name;
        String product1price;
        String product2price;
        String quantityBtn1;
        String quantityBtn2;
        String totalPrice1;
        String totalPrice2;

       for (int i =0;i<2 ;i++){
           ActionsHelpers.moveToElement(productPage.getProduct1(),driver);
           ActionsHelpers.clickButton(productPage.getAddToCart1stItem(),driver,15);
           ActionsHelpers.clickButton(productPage.getContinueShopping(),driver,15);
       }
        ActionsHelpers.moveToElement(productPage.getProduct2(),driver);
        ActionsHelpers.clickButton(productPage.getAddToCart2ndItem(),driver,15);
        ActionsHelpers.clickButton(productPage.getViewCart(),driver,15);

         product1Name = ActionsHelpers.getText(cartPage.getProduct1Name(),driver);
         Assert.assertEquals(product1Name,"Blue Top");
         product2Name = ActionsHelpers.getText(cartPage.getProduct2Name(),driver);
         Assert.assertEquals(product2Name,"Men Tshirt");
         product1price = ActionsHelpers.getText(cartPage.getProduct1price(),driver);
        Assert.assertEquals(product1price,"Rs. 500");
         product2price= ActionsHelpers.getText(cartPage.getProduct2Price(),driver);
        Assert.assertEquals(product2price,"Rs. 400");
         quantityBtn1= ActionsHelpers.getText(cartPage.getQuantityBtn1(),driver);
        Assert.assertEquals(quantityBtn1,"2");
         quantityBtn2= ActionsHelpers.getText(cartPage.getQuantityBtn2(),driver);
        Assert.assertEquals(quantityBtn2,"1");
         totalPrice1= ActionsHelpers.getText(cartPage.getTotalPrice1(),driver);
        Assert.assertEquals(totalPrice1,"Rs. 1000");
         totalPrice2 = ActionsHelpers.getText(cartPage.getTotalPrice2(),driver);
        Assert.assertEquals(totalPrice2,"Rs. 400");
    }
}