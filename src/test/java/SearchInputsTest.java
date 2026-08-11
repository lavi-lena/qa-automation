import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class SearchInputsTest extends BaseTest{
    private WebDriver driver;


    @Test
    public void testUsernameFieldInput() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("student");
        String actualTextInField = usernameInput.getAttribute("value");
        Assertions.assertEquals("student", actualTextInField);
    }

}
