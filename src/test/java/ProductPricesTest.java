import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ProductPricesTest extends BaseTest {

    @Test
    public void testProductPrices() {
        loginToSaucedemo();
        List<WebElement> elementList = driver.findElements(By.className("inventory_item_price"));
        List<String> textList = elementList.stream()
                .map(element->element.getText())
                .toList();
        Assertions.assertTrue(textList.contains("$49.99"));

    }
}
