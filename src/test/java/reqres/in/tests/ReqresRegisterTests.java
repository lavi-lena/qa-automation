package reqres.in.tests;
import org.junit.jupiter.api.Test;
import reqres.in.models.RegisterRequest;
import reqres.in.models.RegisterResponse;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReqresRegisterTests extends BaseTest{
    @Test
    public void testRegisterSuccess() {
        RegisterRequest registerData = new RegisterRequest("eve.holt@reqres.in", "pistol");

        RegisterResponse response = given()
                .body(registerData)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200)
                .extract().as(RegisterResponse.class);

        assertNotNull(response.getId());
        assertNotNull(response.getToken());
    }
    @Test
    public void testRegisterMissingPassword() {
        RegisterRequest registerData = new RegisterRequest("sydney@fife", null);

        RegisterResponse response =
                given()
                .body(registerData)

                .when()
                .post("/api/register")

                .then()
                .statusCode(400)
                .extract().as(RegisterResponse.class);

        assertEquals("Missing password", response.getError());
    }

}
