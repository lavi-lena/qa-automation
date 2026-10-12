package reqres.in.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import reqres.in.models.UserRequest;
import reqres.in.models.UserResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReqresApiTests {
    @BeforeAll
    public static void setUp() {
        // Задаем базовый URI один раз для всех тестов в классе
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test
    public void testGetSingleUser() {
        // Проверяем получение существующего пользователя (GET /api/users/2)
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200) // Проверяем успешный HTTP-статус
                .body("data.id", equalTo(2)) // Проверка полей JSON через Hamcrest матчеры
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .body("data.first_name", equalTo("Janet"))
                .body("data.last_name", equalTo("Weaver"));
    }

    @Test
    public void testCreateUserSuccess() {
        UserRequest newUser = new UserRequest("morpheus", "leader");
        UserResponse response = given()
                .contentType(ContentType.JSON)
                .body(newUser)

                .when()
                .post("/api/users")

                .then()
                .statusCode(201) // Проверяем, что объект успешно создан (201 Created)
                .extract().as(UserResponse.class);

        assertEquals("morpheus", response.getName());
        assertEquals("leader", response.getJob());
        assertNotNull(response.getId());       // Убеждаемся, что сервер сгенерировал ID
        assertNotNull(response.getCreatedAt());
    }
}
