import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TitleTest extends BaseTest{



    @Test
    public void testGoogleTitle() {
        driver.get("https://google.com");
        String actualTitle = driver.getTitle();
        Assertions.assertEquals("Google", actualTitle);
    }


}



