package automationexercise.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountDetailsPage {
    private WebDriver driver;

    private By pageHeader = By.cssSelector("h2.title b");
    private By titleGenderMr = By.id("id_gender1");
    private By passwordInput = By.id("password");
    private By daysSelect = By.id("days");
    private By monthsSelect = By.id("months");
    private By yearsSelect = By.id("years");

    private By newsletterCheckbox = By.id("newsletter");
    private By offersCheckbox = By.id("optin");

    private By firstNameInput = By.id("first_name");
    private By lastNameInput = By.id("last_name");
    private By companyInput = By.id("company");
    private By address1Input = By.id("address1");
    private By address2Input = By.id("address2");
    private By countrySelect = By.id("country");
    private By stateInput = By.id("state");
    private By cityInput = By.id("city");
    private By zipcodeInput = By.id("zipcode");
    private By mobileInput = By.id("mobile_number");
    private By createAccountButton = By.cssSelector("button[data-qa='create-account']");

    public AccountDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageHeader() {
        return driver.findElement(pageHeader).getText();
    }

    public void fillAccountDetails(String password, String day, String month, String year) {
        driver.findElement(titleGenderMr).click();
        driver.findElement(passwordInput).sendKeys(password);

        new Select(driver.findElement(daysSelect)).selectByValue(day);
        new Select(driver.findElement(monthsSelect)).selectByVisibleText(month);
        new Select(driver.findElement(yearsSelect)).selectByValue(year);
    }

    public void selectCheckboxes() {
        driver.findElement(newsletterCheckbox).click();
        driver.findElement(offersCheckbox).click();
    }

    public void fillAddressDetails(String firstName, String lastName, String company, String addr1,
                                   String addr2, String country, String state, String city, String zip, String mobile) {
        driver.findElement(firstNameInput).sendKeys(firstName);
        driver.findElement(lastNameInput).sendKeys(lastName);
        driver.findElement(companyInput).sendKeys(company);
        driver.findElement(address1Input).sendKeys(addr1);
        driver.findElement(address2Input).sendKeys(addr2);

        new Select(driver.findElement(countrySelect)).selectByVisibleText(country);

        driver.findElement(stateInput).sendKeys(state);
        driver.findElement(cityInput).sendKeys(city);
        driver.findElement(zipcodeInput).sendKeys(zip);
        driver.findElement(mobileInput).sendKeys(mobile);
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }
}
