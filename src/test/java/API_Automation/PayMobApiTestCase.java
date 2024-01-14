package API_Automation;

import com.tngtech.java.junit.dataprovider.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class PayMobApiTestCase {

    @DataProvider
    public static Object[][] nameAndJob() {
        return new Object[][]{
                {"Alyaa", "leader"},
                {"Alaa", "QA"},
        };
    }

    @DataProvider
    public static Object[][] UpdateJob() {
        return new Object[][]{
                {2, "Alyaa", "manager"},
                {2, "Alaa", "marketing manager"},
        };
    }

    @Test
    @UseDataProvider("nameAndJob")
    public void creatingNewRecordsWithNamesAndJobs(String name, String job) {

        String baseURI = "https://reqres.in";
        String endpoint = "/api/users";

        String requestBody = "{ \"name\": \"" + name + "\", \"job\": \"" + job + "\" }";

        String response = RestAssured.given()
                .baseUri(baseURI)
                .basePath(endpoint)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post()
                .then()
                .statusCode(201)
                .extract().asString();

        System.out.println("Response: " + response);
    }


    @Test
    @UseDataProvider("UpdateJob")
    public void updateUsersData(int userId, String name, String job) {

        String baseURI = "https://reqres.in";
        String endpoint = "/api/users/" + userId;

        String requestBody = "{ \"name\": \"" + name + "\", \"job\": \"" + job + "\" }";

        // Send PUT request to update an existing user
        String response = RestAssured.given()
                .baseUri(baseURI)
                .basePath(endpoint)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .put()
                .then()
                .statusCode(200)
                .extract().asString();

        System.out.println("Response: " + response);
    }
    @Test
    public void listAllUsers() {
        String baseURI = "https://reqres.in";
        String endpoint = "/api/unknown";

        String response = RestAssured.given()
                .baseUri(baseURI)
                .basePath(endpoint)
                .get()
                .then()
                .statusCode(200)  // Expecting HTTP 200 OK status
                .extract().asString();

        System.out.println("Response: " + response);
    }
    @Test
    public void testDeleteUser() {
        String baseURI = "https://reqres.in";
        String endpoint = "/api/users/2";

        RestAssured.given()
                .baseUri(baseURI)
                .basePath(endpoint)
                .delete()
                .then()
                .statusCode(204);
    }
}