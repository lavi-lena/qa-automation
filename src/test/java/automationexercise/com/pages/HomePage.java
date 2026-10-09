package automationexercise.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By homePageMarker = By.id("slider");
    private By signupLoginButton = By.linkText("Signup / Login");
    private By loggedInAsText = By.cssSelector("li a i.fa-user");
    private By deleteAccountButton = By.linkText("Delete Account");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isHomePageVisible() {
        return driver.findElement(homePageMarker).isDisplayed();
    }

    public void clickSignupLogin() {
        driver.findElement(signupLoginButton).click();
    }

    public String getLoggedInUserText() {
        return driver.findElement(loggedInAsText).findElement(By.xpath("..")).getText();
    }
    public void clickDeleteAccount() {
        driver.findElement(deleteAccountButton).click();
    }
}
