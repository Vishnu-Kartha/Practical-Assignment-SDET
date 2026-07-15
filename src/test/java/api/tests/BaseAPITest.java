package api.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;

public class BaseAPITest {
    public RequestSpecification rs;
    protected final String BASE_URI = "https://test.com/autocomplete-form";

    String responseSchemaPath = "src/test/java/api/environment.properties/responseSchema.json";

    @BeforeMethod
    public void SetUp(){
        rs = RestAssured.given();
        rs.baseUri(BASE_URI);
        rs.header("Content-Type", ContentType.JSON);
        rs.header("accept", "application/json");
    }

}
