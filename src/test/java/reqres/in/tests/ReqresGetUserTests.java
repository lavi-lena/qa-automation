package reqres.in.tests;

import org.junit.jupiter.api.Test;
import reqres.in.models.UserData;
import reqres.in.models.UserListResponse;
import reqres.in.models.UserRequest;
import reqres.in.models.UserResponse;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

public class ReqresGetUserTests extends BaseTest {


    @Test
    public void testGetSingleUser() {
        // Проверяем получение существующего пользователя (GET /api/users/2)
        given()

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
    public void testGetUsersList() {
        UserListResponse response = given()
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .extract().as(UserListResponse.class);

        assertEquals(2, response.getPage());

        List<UserData> users = response.getData();
        assertEquals(6, users.size());

        for (UserData user : users) {
            assertTrue(user.getEmail().endsWith("@reqres.in"));
        }

        boolean hasTobias = users.stream()
                .anyMatch(user -> user.getFirst_name().equals("Tobias"));
        assertTrue(hasTobias);
    }
}
