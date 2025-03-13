package pages.api;

import static io.restassured.RestAssured.when;

public class HomePageApi {
    public static void main(String[] args) {
        String URL = "https://7745.by/";
        when().get(URL).then().statusCode(200);
    }
}
