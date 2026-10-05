package saucedemo.com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class EmptyAuthTest extends BaseTest {

    @Test
    public void testEmptyAuth() {
        driver.get("https://saucedemo.com");
        driver.findElement(By.id("login-button")).click();
        String errorText = driver.findElement(By.cssSelector("[data-test='error']")).getText();
        Assertions.assertTrue(errorText.contains("Epic sadface: Username is required"));

    }
}
