import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.time.Duration;

public class ElementsCountTest extends BaseTest{




    @Test
    public void testCatalogItemsCount() {
        loginToSaucedemo();

        List<WebElement> itemsList = driver.findElements(By.className("inventory_item"));
        int actualCount = itemsList.size();
        Assertions.assertEquals(6, actualCount);
    }


}
