package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDeleted {


    By Accountdeleted = By.xpath("//b[text()='Account Deleted!']");

    By Continue =By.xpath("//a[@data-qa = 'continue-button']");

    public By getAccountdeleted() {
        return Accountdeleted;
    }

    public By getContinue() {
        return Continue;
    }
}
