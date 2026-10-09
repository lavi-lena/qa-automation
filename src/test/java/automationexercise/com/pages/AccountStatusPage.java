package automationexercise.com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountStatusPage {
    private WebDriver driver;

    private By statusHeader = By.cssSelector("h2[data-qa='account-created'], h2[data-qa='account-deleted']");
    private By continueButton = By.cssSelector("a[data-qa='continue-button']");

    public AccountStatusPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getStatusHeaderText() {
        return driver.findElement(statusHeader).getText();
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();


    }
}

