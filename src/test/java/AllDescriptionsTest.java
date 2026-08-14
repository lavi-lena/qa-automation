import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class AllDescriptionsTest extends BaseTest{

    @Test
    public void testAllDescription(){
        loginToSaucedemo();
        List<WebElement> itemsDescriptionsElements = driver.findElements(By.className("inventory_item_desc"));
        List<String> itemsDescriptions = itemsDescriptionsElements.stream()
                .map(item->item.getText())
                .toList();
        Assertions.assertTrue(itemsDescriptions.stream().noneMatch(item->item.isEmpty()));

    }
}
