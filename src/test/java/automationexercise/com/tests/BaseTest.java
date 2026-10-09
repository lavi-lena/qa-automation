package automationexercise.com.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class BaseTest {
    protected ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        // настройка для того, чтобы убрать всплывающую google рекламу, которая мешает выполнению тестов
        driver.executeCdpCommand("Network.enable", new HashMap<String, Object>());
        Map<String, Object> params = new HashMap<>();
        params.put("urls", Arrays.asList(
                "*googlesyndication.com*",
                "*doubleclick.net*",
                "*googleadservices.com*",
                "*adservice.google.*",
                "*adtrafficquality.google*",
                "*googletagservices.com*"));
        driver.executeCdpCommand("Network.setBlockedURLs", params);
    }


    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
