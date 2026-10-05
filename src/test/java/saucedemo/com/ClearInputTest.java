package saucedemo.com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClearInputTest extends BaseTest {



    @Test
    public void testClearAndReType() {
        driver.get("https://saucedemo.com");
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("wrong_user");
        usernameField.clear();
        usernameField.sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("inventory.html"));

    }



}
