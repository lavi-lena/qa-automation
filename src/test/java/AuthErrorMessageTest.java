import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class AuthErrorMessageTest extends BaseTest {


    @Test
    public void testLockedOutUserError() {
        loginToSaucedemo();
        WebElement errorContainer = driver.findElement(By.cssSelector("[data-test='error']"));
        String actualErrorText = errorContainer.getText();
        boolean isTextCorrect = actualErrorText.contains("Epic sadface: Sorry, this user has been locked out.");
        Assertions.assertTrue(isTextCorrect);
    }

}
