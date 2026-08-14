import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // Создаем карту настроек (prefs)
        Map<String, Object> prefs = new HashMap<>();

        // Отключаем сохранение паролей и предложения их сменить
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        // Отключаем проверку утечки паролей (часто вызывает баг с "Смените пароль")
        prefs.put("profile.password_manager_leak_detection", false);

        // Передаем настройки в опции браузера
        options.setExperimentalOption("prefs", prefs);


        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    protected void loginToSaucedemo(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}



