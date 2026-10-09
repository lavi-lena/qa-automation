package automationexercise.com.tests;
import org.junit.jupiter.api.Test;
import automationexercise.com.pages.HomePage;
import automationexercise.com.pages.SignupLoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginUserWithIncorrectCredentials extends BaseTest{
    private final String incorrectEmail = "wrong_user_email_12345@invalid.com";
    private final String incorrectPassword = "WrongPassword123";

    @Test
    public void testLoginUserWithIncorrectCredentials() {
        driver.get("http://automationexercise.com");

        HomePage homePage = new HomePage(driver);
        SignupLoginPage signupLoginPage = new SignupLoginPage(driver);

        assertTrue(homePage.isHomePageVisible(), "Главная страница не отобразилась!");

        homePage.clickSignupLogin();

        assertEquals("Login to your account", signupLoginPage.getLoginHeadertext());

        signupLoginPage.loginWithCredentials(incorrectEmail, incorrectPassword);
        signupLoginPage.clickLogin();

        assertEquals("Your email or password is incorrect!", signupLoginPage.getErrorMessageText());
    }
}
