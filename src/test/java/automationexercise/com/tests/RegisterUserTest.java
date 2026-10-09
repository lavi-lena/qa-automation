package automationexercise.com.tests;

import org.junit.jupiter.api.Test;
import automationexercise.com.pages.AccountDetailsPage;
import automationexercise.com.pages.AccountStatusPage;
import automationexercise.com.pages.HomePage;
import automationexercise.com.pages.SignupLoginPage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterUserTest extends BaseTest {
    private final String username = "QA_Tester_Java";
    private final String email = "qa_java_test" + System.currentTimeMillis() + "@example.com";


    @Test
    public void testRegisterUser() {
        driver.get("http://automationexercise.com");

        HomePage homePage = new HomePage(driver);
        SignupLoginPage signupLoginPage = new SignupLoginPage(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        AccountStatusPage accountStatusPage = new AccountStatusPage(driver);

        assertTrue(homePage.isHomePageVisible(), "Главная страница не отобразилась!");
        homePage.clickSignupLogin();
        assertEquals("New User Signup!", signupLoginPage.getSignupHeadertext());

        signupLoginPage.enterNameAndEmail(username, email);
        signupLoginPage.clickSignup();
        assertEquals("ENTER ACCOUNT INFORMATION", accountDetailsPage.getPageHeader());

        accountDetailsPage.fillAccountDetails("SuperSecret123", "15", "September", "1995");
        accountDetailsPage.selectCheckboxes();

        accountDetailsPage.fillAddressDetails(
                "John", "Doe", "Test Company", "123 Main Street", "Apt 4B",
                "United States", "California", "Los Angeles", "90001", "1234567890"
        );
        accountDetailsPage.clickCreateAccount();

        assertEquals("ACCOUNT CREATED!", accountStatusPage.getStatusHeaderText());

        accountStatusPage.clickContinue();

        assertEquals("Logged in as " + username, homePage.getLoggedInUserText());

        homePage.clickDeleteAccount();
        assertEquals("ACCOUNT DELETED!", accountStatusPage.getStatusHeaderText());
        accountStatusPage.clickContinue();
    }


}

