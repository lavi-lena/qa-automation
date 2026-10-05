package saucedemo.com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CurrentUrlTest extends BaseTest {



    @Test
    public void testSuccessfulLoginRedirect() {
        loginToSaucedemo();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assertions.assertEquals(expectedUrl, actualUrl);
    }


}
