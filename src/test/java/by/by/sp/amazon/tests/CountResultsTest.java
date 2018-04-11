package by.by.sp.amazon.tests;

import by.by.sp.amazon.model.SearchData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountResultsTest extends TestBase {

    @Test
    public void CountResultsTest() throws Exception {
        app.getSearchResultsHelper().search(new SearchData("ipad case"));
        int actResultsCount = app.getSearchResultsHelper().getSearchResultsCount();
        int expResultsCount = 30;
        Assert.assertEquals(actResultsCount, expResultsCount);
    }
}
