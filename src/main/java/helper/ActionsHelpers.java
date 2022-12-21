package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsHelpers {

    static WebDriver driver;

    public ActionsHelpers(WebDriver driver) {
        this.driver = driver;
    }

    public static String sendKeysAction(String keys, By element, WebDriver driver) {
        String results = "";
        WebElement nameElement = driver.findElement(element);
        nameElement.sendKeys(keys);
        results = nameElement.getAttribute("value");

        return results;
    }


    public static Boolean clickAction(By element, WebDriver driver) {
        Boolean results = Boolean.FALSE;
        WebElement nameElement = driver.findElement(element);
        nameElement.click();
        results = nameElement.isSelected();

        return results;
    }

    public static void clickButton(By element, WebDriver driver, int duration) {

        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement nameElement = wt.until(ExpectedConditions.elementToBeClickable(element));
        nameElement.click();


    }


    public static String selectDropDownAction(String keys, By element, WebDriver driver) {
        String results = "";

        Select elements = new Select(driver.findElement(element));
        elements.selectByVisibleText(keys);
        WebElement o = elements.getFirstSelectedOption();

        results = o.getText();

        return results;
    }

    public static String getText(By element, WebDriver driver) {
        String results;
        WebElement nameElement = driver.findElement(element);
        nameElement.getText();
        results = nameElement.getText();

        return results;

    }

    public static void moveToElement(By element, WebDriver driver) {
        WebElement hoverable = driver.findElement(element);
        new Actions(driver).moveToElement(hoverable).perform();
    }
}