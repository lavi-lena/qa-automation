package reqres.in.tests;
import org.junit.jupiter.api.Test;
import reqres.in.models.UserRequest;
import reqres.in.models.UserResponse;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReqresUpdateDeleteTests extends BaseTest {
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
