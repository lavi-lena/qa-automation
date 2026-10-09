package automationexercise.com.tests;

import automationexercise.com.pages.AccountStatusPage;
import automationexercise.com.pages.HomePage;
import automationexercise.com.pages.SignupLoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginUserWithCorrectCredentialsTest extends BaseTest{
    private final String validUsername = "QA_Tester_Java";
    private final String validEmail = "qa_java_test_login@example.com";
    private final String validPassword = "SuperSecret123";

    @Test
    public void testLoginUserWithCorrectCredentials() {
        driver.get("http://automationexercise.com");

        HomePage homePage = new HomePage(driver);
        SignupLoginPage signupLoginPage = new SignupLoginPage(driver);
        AccountStatusPage accountStatusPage = new AccountStatusPage(driver);

        assertTrue(homePage.isHomePageVisible(), "Главная страница не отобразилась!");

        homePage.clickSignupLogin();

        assertEquals("Login to your account", signupLoginPage.getLoginHeadertext());

        signupLoginPage.loginWithCredentials(validEmail, validPassword);
        signupLoginPage.clickLogin();

        assertEquals("Logged in as " + validUsername, homePage.getLoggedInUserText());

        homePage.clickDeleteAccount();
        assertEquals("ACCOUNT DELETED!", accountStatusPage.getStatusHeaderText());
    }

}
