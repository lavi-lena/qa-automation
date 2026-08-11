import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class XPathClickTest extends BaseTest {

    @Test
    public void testCheckoutWithXPath() {
        driver.get("https://saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.xpath("//button[text()='Checkout']")).click();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertTrue(currentUrl.contains("checkout-step-one.html"));
    }
}
