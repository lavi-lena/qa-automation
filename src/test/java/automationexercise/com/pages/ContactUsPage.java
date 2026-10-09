package automationexercise.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
    private WebDriver driver;

    private By contactUsHeader = By.cssSelector("h2.title");
    private By nameInput = By.cssSelector("input[data-qa='name']");
    private By emailInput = By.cssSelector("input[data-qa='email']");
    private By subjectInput = By.cssSelector("input[data-qa='subject']");
    private By messageInput = By.id("message");
    private By submitButton = By.cssSelector("input[data-qa='submit-button']");
    private By successMessage = By.cssSelector("div.alert-success");
    public ContactUsPage(WebDriver driver) {
        this.driver = driver;

    }

    public String getContactUsHeadertext() {

        return driver.findElement(contactUsHeader).getText();
    }

    public void fillContactUsDetails(String name, String email, String subject, String message) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(subjectInput).sendKeys(subject);
        driver.findElement(messageInput).sendKeys(message);
    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }
    public String getSuccessMessagetext() {

        return driver.findElement(successMessage).getText();
    }
}
