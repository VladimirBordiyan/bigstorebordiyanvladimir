package by.bigstore.apitest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class HomePageApiTest {
    @Test
    public void test() {
        String URL = "https://7745.by/";
        when()
                .get(URL)
                .then().log().all()
                .statusCode(200);
    }
}
