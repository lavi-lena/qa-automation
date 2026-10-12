package reqres.in.tests;

import org.junit.jupiter.api.Test;
import reqres.in.models.LoginRequest;
import reqres.in.models.LoginResponse;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReqresLoginTests extends BaseTest {
    @Test
    public void testLoginSuccess() {
        LoginRequest loginData = new LoginRequest("eve.holt@reqres.in", "cityslicker");

        LoginResponse response = given()
                .body(loginData)
                .when()
                .post("/api/login")
                .then()
                .statusCode(200)
                .extract().as(LoginResponse.class);

        assertNotNull(response.getToken()); // Проверяем, что токен успешно получен
    }

    @Test
    public void testLoginMissingPassword() {
        // Отправляем запрос без пароля, чтобы проверить обработку ошибки
        LoginRequest loginData = new LoginRequest("eve.holt@reqres.in", null);

        LoginResponse response = given()
                .body(loginData)
                .when()
                .post("/api/login")
                .then()
                .statusCode(400)
                .extract().as(LoginResponse.class);

        assertEquals("Missing password", response.getError()); // Проверяем сообщение об ошибке
    }
}
