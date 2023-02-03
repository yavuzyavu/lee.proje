package lee.utilities;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtils {
    public static String generateToken(String email,String password){
        //https://cybertek-reservation-api-docs.herokuapp.com/

        Response response = given().queryParam("email", email)
                .queryParam("password", password)
                .when().get(ConfigurationReader.get("qa1api.uri") + "/sign");

        //get token from api and save token
        String token = "Bearer "+ response.path("accessToken");
        return token;

    }
}