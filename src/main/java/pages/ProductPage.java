package pages;

import org.openqa.selenium.By;

public class ProductPage {
    By searchProduct = By.xpath("//*[@id=\"search_product\"]");
    By searchBtn = By.xpath("//*[@id=\"submit_search\"]/i");
    By product1 = By.xpath("//img[@src='/get_product_picture/1']/following-sibling::p");
    By product2 = By.xpath("//img[@src='/get_product_picture/2']/following-sibling::p");
    By listOfproducts = By.xpath("//div[@class = 'overlay-content']/p");
    By AddToCart1stItem = By.xpath("//div[@class='overlay-content']/p[text()='Blue Top']/following-sibling::a");
    By AddToCart2ndItem = By.xpath("//div[@class='overlay-content']/p[text()='Men Tshirt']/following-sibling::a");
    By continueShopping = By.xpath("//button[@class='btn btn-success close-modal btn-block']");
    By viewCart = By.xpath ("//u[text()=\"View Cart\"]");
    public By getProduct2() {
        return product2;
    }
    public By getViewCart() {
        return viewCart;
    }

    public By getAddToCart2ndItem() {
        return AddToCart2ndItem;
    }
    public By getContinueShopping() {
        return continueShopping;
    }
    public By getAddToCart1stItem() {
        return AddToCart1stItem;
    }

    public By getListOfproducts() {
        return listOfproducts;
    }

    public By getSearchProduct() {
        return searchProduct;
    }

    public By getSearchBtn() {
        return searchBtn;
    }

    public By getProduct1() {
        return product1;
    }

}


