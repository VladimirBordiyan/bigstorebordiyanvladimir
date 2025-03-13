package by.bigstore.apitest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class BigstoreApiTest {
    @Test
    @DisplayName("GET home page")
    public void test() {
        String URL = "https://7745.by/";
        when()
                .get(URL)
                .then().log().all()
                .statusCode(200);
    }
}
