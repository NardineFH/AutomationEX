package test;

import helper.ActionsHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;
import java.util.List;

public class TC09 {
    WebDriver driver;
    HomePage homePage;

    InformationPage informationPage ;
    SignUpPage signUpPage;
    AccountCreated accountCreated;
    ProductPage productPage;

    @BeforeClass
    public  void init (){

        driver = new ChromeDriver();
        informationPage = new InformationPage();
        signUpPage = new SignUpPage ();
        homePage = new HomePage();
        accountCreated = new AccountCreated();
        productPage = new ProductPage();
        driver.get(informationPage.getURL());

    }

    @Test(priority = 0)
    public void clickONproductsBtn()
    {
        String productsBtn = ActionsHelpers.getText(homePage.getProductsBTN(),driver);
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3));
        wt.until(ExpectedConditions.elementToBeClickable (homePage.getProductsBTN())).click();


    }
    @Test (priority = 1)
    public void searchProducts () {
        String searchProduct = ActionsHelpers.sendKeysAction("Blue Top", homePage.getSearchProduct(), driver);
        Assert.assertEquals(searchProduct, "Blue Top");
        driver.findElement(homePage.getSearchBtn()).click();
        String text =ActionsHelpers.getText(productPage.getProduct1(), driver);
        Assert.assertEquals(text,"Blue Top");
    }
    @Test (priority = 2)
    public void searchlistOfProducts () {
        driver.findElement(productPage.getSearchProduct()).clear();
        String searchlistOfProducts = ActionsHelpers.sendKeysAction("Top", productPage.getSearchProduct(), driver);
       // Assert.assertEquals(searchlistOfProducts, "Top");
        driver.findElement(homePage.getSearchBtn()).click();
        List<WebElement>  listOfProducts = driver.findElements(productPage.getListOfproducts());
        for( WebElement i: listOfProducts) {
          String text =  i.getText();
          Assert.assertTrue(text.contains("Top"));
        }
    }

    }





