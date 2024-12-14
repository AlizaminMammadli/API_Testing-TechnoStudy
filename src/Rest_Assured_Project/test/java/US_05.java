package Rest_Assured_Project.test.java;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class US_05 extends Rest_Assured_Project.test.java.Setup {


    @Test
    public void Task12() {
        given()
                .spec(requestSpec)
                .when()
                .get("movie/top_rated?language=en-US&page=1")
                .then()
                .log().body()
                .statusCode(200);

    }

    @Test
    public void Task13() {
        given()
                .spec(requestSpec)
                .when()
                .get("movie/upcoming?language=en-US&page=1")
                .then()
                .log().body()
                .statusCode(200);
    }
}