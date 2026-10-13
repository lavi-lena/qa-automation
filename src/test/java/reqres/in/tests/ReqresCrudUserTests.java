package reqres.in.tests;
import org.junit.jupiter.api.Test;
import reqres.in.models.UserRequest;
import reqres.in.models.UserResponse;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ReqresCrudUserTests extends BaseTest {

    @Test
    public void testCreateUserSuccess() {
        UserRequest newUser = new UserRequest("morpheus", "leader");
        UserResponse response = given()

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

    @Test
    public void testUpdateUserSuccess() {
        UserRequest updateData = new UserRequest("morpheus", "zion resident");
        UserResponse response = given()
                .body(updateData)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .extract().as(UserResponse.class);
        assertEquals("morpheus", response.getName());
        assertEquals("zion resident", response.getJob());
        assertNotNull(response.getUpdatedAt());
    }
    @Test
    public void testDeleteUserSuccess() {
        given()
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204);
    }
}
