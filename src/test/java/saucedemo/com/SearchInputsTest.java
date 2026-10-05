package saucedemo.com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SearchInputsTest extends BaseTest {


    @Test
    public void testUsernameFieldInput() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("student");
        String actualTextInField = usernameInput.getAttribute("value");
        Assertions.assertEquals("student", actualTextInField);
    }

}
