package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreated {



    By AccountCreated = By.xpath("//b[text()='Account Created!']");

    By Continue =By.xpath("//a[@data-qa = 'continue-button']");

    public By getAccountCreated() {
        return AccountCreated;
    }

    public By getContinue() {
        return Continue;
    }
}
