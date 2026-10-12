package reqres.in.tests;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    public static void setUp() {
        // Задаем базовый URL для всех тестов, которые унаследуют этот класс
        RestAssured.baseURI = "https://reqres.in";

        // Настраиваем автоматический Content-Type и логирование запросов
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        // Настраиваем автоматическое логирование всех ответов от сервера
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }

}
