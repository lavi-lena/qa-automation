import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ClickTest extends BaseTest {



    @Test
    public void testAddToCartButton() {
        loginToSaucedemo();
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();

        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        String removeButtonText = removeButton.getText();
        Assertions.assertEquals("Remove",removeButtonText);

        WebElement shoppingCartBadge = driver.findElement(By.className("shopping_cart_badge"));
        String cartCount = shoppingCartBadge.getText();
        Assertions.assertEquals("1", cartCount);

    }

}

