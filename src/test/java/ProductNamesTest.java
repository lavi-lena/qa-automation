import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductNamesTest extends BaseTest {

    @Test
    public void testProductListContainsJacket() {
        loginToSaucedemo();

        List<WebElement> nameElements = driver.findElements(By.className("inventory_item_name"));
        List<String> allProductNames = nameElements.stream()
                .map(element -> element.getText())
                .toList();
        boolean hasJacket = allProductNames.contains("Sauce Labs Fleece Jacket");
        Assertions.assertTrue(hasJacket, "Куртка не найдена в каталоге товаров!");
    }
}