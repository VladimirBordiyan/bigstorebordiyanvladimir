package by.bigstore.apitest;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class LoginApiTest {

    @Test
    public void testLogin() {
        // Базовый URL API
        RestAssured.baseURI = "https://7745.by";
        String requestBody = "{\"username\": \"your_username\", \"password\": \"your_password\"}";

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/api/login")
                .then()
                .log().all()
                .statusCode(200)
                .body("token", notNullValue());
    }
}
