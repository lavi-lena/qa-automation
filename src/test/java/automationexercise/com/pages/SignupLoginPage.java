package automationexercise.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage {
    private WebDriver driver;

    private By signupHeader = By.cssSelector(".signup-form h2");
    private By nameInput = By.cssSelector("input[data-qa='signup-name']");
    private By emailInput = By.cssSelector("input[data-qa='signup-email']");
    private By signupButton = By.cssSelector("button[data-qa='signup-button']");

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
}
