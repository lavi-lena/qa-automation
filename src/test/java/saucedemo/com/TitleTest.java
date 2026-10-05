package saucedemo.com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TitleTest extends BaseTest {



    @Test
    public void testGoogleTitle() {
        driver.get("https://google.com");
        String actualTitle = driver.getTitle();
        Assertions.assertEquals("Google", actualTitle);
    }


}



