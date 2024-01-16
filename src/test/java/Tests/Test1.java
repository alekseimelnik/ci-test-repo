package Tests;

import io.restassured.RestAssured;
import io.restassured.authentication.OAuth2Scheme;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;

public class Test1 {
    public static void main(String[] args) {
        baseURI = "https://championat.com"; // Замените на URL желаемого сайта
        given()
                .when()
                .get("https://championat.com")
                .then()
                .assertThat()
                .statusCode(200); // Проверка на статус код 200
    }
}
