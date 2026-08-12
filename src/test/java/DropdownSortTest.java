import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownSortTest extends BaseTest {

    @Test
    public void testDropdownSortingZtoA() {
        loginToSaucedemo();

        WebElement dropdownElement = driver.findElement(By.className("product_sort_container"));
        Select sortSelect = new Select(dropdownElement);
        sortSelect.selectByValue("za");
        WebElement firstProduct = driver.findElement(By.className("inventory_item_name"));
        Assertions.assertEquals("Test.allTheThings() T-Shirt (Red)", firstProduct.getText());
    }
}
