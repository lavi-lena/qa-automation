package saucedemo.com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogout() {
        loginToSaucedemo();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.saucedemo.com/", currentUrl);
    }
}
