package api.tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.PreparedStatement;

public class LocaleValidationTest extends BaseAPITest{
    @Test
    public void verifyLocale(){
        Response response = rs.get("/account-id/98765");
        Assert.assertEquals(response.statusCode(), 200);
        String locale = response.body().jsonPath().get("locale");
        Assert.assertTrue(locale.matches("^[a-z]{2}-[A-Z]{2}$"));
    }
    public void verifyInvalidLocale(){
        Response response = rs.get("/account-id/98765");
        Assert.assertEquals(response.statusCode(), 200);
        String locale = response.body().jsonPath().get("locale");
        Assert.assertTrue(locale.matches("^[a-z]{2}$"));
    }
}
