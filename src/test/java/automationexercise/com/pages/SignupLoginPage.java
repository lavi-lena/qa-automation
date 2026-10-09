package automationexercise.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage {
    private WebDriver driver;

    private By signupHeader = By.cssSelector(".signup-form h2");
    private By nameInput = By.cssSelector("input[data-qa='signup-name']");
    private By emailInput = By.cssSelector("input[data-qa='signup-email']");
    private By signupButton = By.cssSelector("button[data-qa='signup-button']");

    private By loginHeader = By.cssSelector(".login-form h2");
    private By loginEmailInput = By.cssSelector("input[data-qa='login-email']");
    private By loginPasswordInput = By.cssSelector("input[data-qa='login-password']");
    private By loginButton = By.cssSelector("button[data-qa='login-button']");

    private By errorMessage = By.cssSelector(".login-form p");

    public SignupLoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getSignupHeadertext() {

        return driver.findElement(signupHeader).getText();
    }

    public void enterNameAndEmail(String name, String email) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);
    }

    public void clickSignup() {
        driver.findElement(signupButton).click();
    }
    public String getLoginHeadertext() {
        return driver.findElement(loginHeader).getText();
    }

    public void loginWithCredentials(String email, String password) {
        driver.findElement(loginEmailInput).sendKeys(email);
        driver.findElement(loginPasswordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    public String getErrorMessageText() {
        return driver.findElement(errorMessage).getText();
    }
}
