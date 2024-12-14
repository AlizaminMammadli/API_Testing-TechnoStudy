package Rest_Assured_Project.test.java;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class US_02 extends Rest_Assured_Project.test.java.Setup {

    @Test
    public void Task06() {

        given()

                .spec(requestSpec)

                .when()
                .get("account/21632548/favorite/movies?account_id=int32")

                .then()
                .log().body()
                .statusCode(200)
        ;
    }

    @Test
    public void Task07() {

        given()

                .spec(requestSpec)

                .when()
                .get("account/21632548/rated/movies?account_id=int32")

                .then()
                .log().body()
                .statusCode(200)
        ;
    }
}
