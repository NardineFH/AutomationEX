package pages;

import org.openqa.selenium.By;

public class HomePage {

    By userName = By.xpath("//a[text()=' Logged in as ']//b[text()='nardine']");
    By deleteBtn =By.xpath("//a[@href='/delete_account']");
    By loginBtn = By.xpath("//a[@href = '/login']");
    By logOutBtn = By.xpath("//a[@href= '/logout']");
    By productsBTN = By.xpath("//a[@href = '/products']");
    By featuresItems =By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/h2");
    By searchProduct =By.xpath("//*[@id=\"search_product\"]");
    By searchBtn = By.xpath("//*[@id=\"submit_search\"]/i");
    By product = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]");

    public By getProduct() {
        return product;
    }

    public By getSearchProduct() {
        return searchProduct;
    }

    public By getSearchBtn() {
        return searchBtn;
    }

    public By getVisibleProducts() {
        return searchProduct;
    }

    public By getProductsBTN() {
        return productsBTN;
    }

    public By getFeaturesItems() {
        return featuresItems;
    }


    String homePageURL = "https://automationexercise.com/";

    public By getUserName() {
        return userName;
    }

    public By getDeleteBtn() {
        return deleteBtn;
    }

    public By getLoginBtn() {
        return loginBtn;
    }

    public String getHomePageURL() {
        return homePageURL;
    }

    public By getLogOutBtn() {
        return logOutBtn;
    }
}


