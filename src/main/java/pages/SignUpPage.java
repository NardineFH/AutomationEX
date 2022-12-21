package pages;

import org.openqa.selenium.By;

public class SignUpPage {

    By SignUp_Name = By.name("name");
    By SignUp_Email = By.xpath("//input[@data-qa='signup-email']");

    By signUp_btn = By.xpath("//button[@data-qa='signup-button']");
    By login_Email = By.xpath("//input[@data-qa='login-email']");

    By login_password = By.xpath("//input[@data-qa='login-password']");

    By loginText = By.xpath("//h2[text()= 'Login to your account']");

    By worngpassText = By.xpath("//p[text() = 'Your email or password is incorrect!']");

    By existemail =  By.xpath("//p[text()='Email Address already exist!']");

    By loginBtn = By.xpath("//button[@data-qa='login-button']");


    String URL="https://automationexercise.com/login";

    public By getWorngpassText() {
        return worngpassText;
    }

    public By getLoginBtn() {
        return loginBtn;
    }

    public By getSignUp_Name() {
        return SignUp_Name;
    }

    public void setSignUp_Name(By signUp_Name) {
        SignUp_Name = signUp_Name;
    }

    public By getSignUp_Email() {
        return SignUp_Email;
    }

    public void setSignUp_Email(By signUp_Email) {
        SignUp_Email = signUp_Email;
    }

    public By getSignUp_btn() {
        return signUp_btn;
    }

    public void setSignUp_btn(By signUp_btn) {
        this.signUp_btn = signUp_btn;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }


    public By getLogin_Email() {
        return login_Email;
    }

    public By getLogin_password() {
        return login_password;
    }

    public By getLoginText() {
        return loginText;
    }

    public By getExistemail() {
        return existemail;
    }
}
