import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class XPathClickTest extends BaseTest {

    @Test
    public void testCheckoutWithXPath() {
        loginToSaucedemo();

        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.xpath("//button[text()='Checkout']")).click();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertTrue(currentUrl.contains("checkout-step-one.html"));
    }
}
