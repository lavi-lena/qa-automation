package reqres.in.tests;

import org.junit.jupiter.api.Test;
import reqres.in.models.ResourceResponse;


import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class ReqresGetResourceTests extends BaseTest{

    @Test
    public void testGetResource(){
        ResourceResponse response = given()
                .when()
                .get("/api/unknown/2")
                .then()
                .statusCode(200)
                .extract().as(ResourceResponse.class);

        assertEquals(2, response.getData().getId());
        assertEquals("fuchsia rose",response.getData().getName());
        assertEquals(2001,response.getData().getYear());
        assertEquals("#C74375",response.getData().getColor());
        assertEquals("17-2031",response.getData().getPantone_value());
    }
}
