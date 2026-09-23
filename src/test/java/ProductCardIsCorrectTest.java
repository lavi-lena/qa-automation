import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductCardIsCorrectTest extends BaseTest{

    @Test
    public void testProductCardIsCorrect() {
        loginToSaucedemo();

        WebElement product = driver.findElement(By.className("inventory_item"));
        WebElement titleElement = product.findElement(By.className("inventory_item_name"));
        String title = titleElement.getText();
        String description = product.findElement(By.className("inventory_item_desc")).getText();
        String price = product.findElement(By.className("inventory_item_price")).getText();

        titleElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_details")));

        String titleAfter = driver.findElement(By.cssSelector(".inventory_details_name")).getText();
        String descriptionAfter = driver.findElement(By.cssSelector(".inventory_details_desc")).getText();
        String priceAfter = driver.findElement(By.cssSelector(".inventory_details_price")).getText();

        Assertions.assertEquals(title,titleAfter);
        Assertions.assertEquals(description,descriptionAfter);
        Assertions.assertEquals(price,priceAfter);

    }


}

