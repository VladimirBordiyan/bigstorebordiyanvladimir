package pages;

import static io.restassured.RestAssured.when;

public class MainApi {
    public static void main(String[] args) {
        String URL = "https://7745.by/";
        when().get(URL).then().statusCode(200);
    }
}
