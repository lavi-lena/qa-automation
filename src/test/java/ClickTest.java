import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ClickTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void testAddToCartButton() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();

        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        String removeButtonText = removeButton.getText();
        Assertions.assertEquals("Remove",removeButtonText);

        WebElement shoppingCartBadge = driver.findElement(By.className("shopping_cart_badge"));
        String cartCount = shoppingCartBadge.getText();
        Assertions.assertEquals("1", cartCount);

    }
    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

