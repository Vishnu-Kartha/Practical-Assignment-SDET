package api.tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuggestionValidationTest extends BaseAPITest{
    @Test
    public void verifySuggestionList(){
        String suggestion = "agile";
        Response response = rs.get("/account-id/98765");
        Assert.assertEquals(response.statusCode(), 200);
        String text = response.body().jsonPath().get("text");
        Assert.assertTrue(text.contains(suggestion));
        String suggestionList = response.body().jsonPath().get("suggestion_list");
        String[] suggestions = suggestionList.split(",");
        for(String sugg: suggestions){
            Assert.assertTrue(sugg.contains(suggestion));
        }
    }
}
