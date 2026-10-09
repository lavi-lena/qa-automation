package automationexercise.com.tests;

import automationexercise.com.pages.ContactUsPage;
import automationexercise.com.pages.HomePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VerifyContactUsPageTest extends BaseTest{
    private final String name = "QA_Tester_Java";
    private final String email = "qa_java_test_login@example.com";
    private final String subject = "test subject";
    private final String message = "test message";

    @Test
    public void testVerifyContactUsPage(){
        driver.get("http://automationexercise.com");

        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = new ContactUsPage(driver);

        assertTrue(homePage.isHomePageVisible(), "Главная страница не отобразилась!");
        homePage.clickContactUs();
        assertEquals("CONTACT US", contactUsPage.getContactUsHeadertext());
        contactUsPage.fillContactUsDetails(name,email,subject,message);
        contactUsPage.clickSubmit();
        driver.switchTo().alert().accept();
        assertEquals("Success! Your details have been submitted successfully.", contactUsPage.getSuccessMessagetext());
    }

}

