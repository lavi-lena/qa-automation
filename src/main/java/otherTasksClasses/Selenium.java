package otherTasksClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void TestSelenium() {
        WebDriver driver = new ChromeDriver();

        try {
            // Открываем сайт Google
            driver.get("https://www.google.com");

            // Выводим заголовок страницы в консоль
            System.out.println("Заголовок страницы: " + driver.getTitle());
        } finally {
            // Закрываем браузер после выполнения теста
            driver.quit();
        }
    }
}
