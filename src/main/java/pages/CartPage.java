package pages;

import org.openqa.selenium.By;

public class CartPage {
    By product2Name = By.xpath("//a[@href=\"/product_details/2\"]");
    By product1Name = By.xpath("//a[@href=\"/product_details/1\"]");
    By product2Price = By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_price\"]/p");
    By product1price = By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_price\"]/p");
    By quantityBtn1 = By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_quantity\"]/button");
    By quantityBtn2 = By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_quantity\"]/button");
    By totalPrice1 = By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_total\"]/p");
    By totalPrice2 = By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_total\"]/p");

    public By getProduct2Name() {
        return product2Name;
    }

    public By getProduct1Name() {
        return product1Name;
    }

    public By getProduct2Price() {
        return product2Price;
    }

    public By getProduct1price() {
        return product1price;
    }

    public By getQuantityBtn1() {
        return quantityBtn1;
    }

    public By getQuantityBtn2() {
        return quantityBtn2;
    }

    public By getTotalPrice1() {
        return totalPrice1;
    }

    public By getTotalPrice2() {
        return totalPrice2;
    }
}
