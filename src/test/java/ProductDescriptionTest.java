import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ProductDescriptionTest extends BaseTest {

    @Test
    public void testProductDescription() {
        loginToSaucedemo();
        String invenoryItemDesc = driver.findElement(By.className("inventory_item_desc")).getText();
        Assertions.assertTrue(invenoryItemDesc.contains("streamlined Slytherin backpack"));


    }
}
