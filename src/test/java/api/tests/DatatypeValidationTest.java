package api.tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatatypeValidationTest extends BaseAPITest{
    @Test
    public void verifyDataTypes(){
        Response response = rs.get("/account-id/98765");
        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertTrue(response.body().jsonPath().get("account_id") instanceof String);
        Assert.assertTrue(response.body().jsonPath().get("account_email") instanceof String);
        Assert.assertTrue(response.body().jsonPath().get("start_date") instanceof String);
        Assert.assertTrue(response.body().jsonPath().get("end_date") instanceof String);
        Assert.assertTrue(response.body().jsonPath().get("locale") instanceof String);
        Assert.assertTrue(response.body().jsonPath().get("text") instanceof String);
        Assert.assertTrue(response.body().jsonPath().get("suggestion_list") instanceof String);
        Assert.assertTrue(response.body().jsonPath().get("completed") instanceof Boolean);
    }
}
