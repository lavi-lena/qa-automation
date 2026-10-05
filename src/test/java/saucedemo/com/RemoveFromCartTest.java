package saucedemo.com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class RemoveFromCartTest extends BaseTest {

    @Test
    public void testRemoveFromCart() {
        loginToSaucedemo();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();


        Assertions.assertThrows(org.openqa.selenium.NoSuchElementException.class, () -> {
                driver.findElement(By.className("shopping_cart_badge"));
        });

    }
}
