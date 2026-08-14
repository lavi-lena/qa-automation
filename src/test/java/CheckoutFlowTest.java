import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckoutFlowTest extends BaseTest {

    @Test
    public void testCheckoutFlow() {
        loginToSaucedemo();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Ivan");
        driver.findElement(By.id("last-name")).sendKeys("Ivanov");
        driver.findElement(By.id("postal-code")).sendKeys("123456");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        WebElement completeHeader = driver.findElement(By.className("complete-header"));
        Assertions.assertEquals("Thank you for your order!", completeHeader.getText());


    }
}
