package api.tests;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.config.BaseTest;

public class SchemaValidationTest extends BaseAPITest {

    @Test
    public void verifyResponseSchema(){
        Response response = rs.get("/account-id/98765");
        Assert.assertEquals(response.statusCode(), 200);
        JsonSchemaValidator js = JsonSchemaValidator.matchesJsonSchemaInClasspath(responseSchemaPath);
        Assert.assertTrue(js.matches(response.body()));
    }

}
