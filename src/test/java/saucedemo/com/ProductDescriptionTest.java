package saucedemo.com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class ProductDescriptionTest extends BaseTest {

    @Test
    public void testProductDescription() {
        loginToSaucedemo();
        String invenoryItemDesc = driver.findElement(By.className("inventory_item_desc")).getText();
        Assertions.assertTrue(invenoryItemDesc.contains("streamlined Slytherin backpack"));


    }
}
