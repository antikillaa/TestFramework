package by.home.sp.testframework.tests;

import org.testng.annotations.Test;

public class ForumPageTest extends TestBase {

    @Test
    public void testForumPage() throws Exception {

        app.getNavigationHelper().goToForumPage();
        app.checkTitle();
        app.getNavigationHelper().returnToMainPage();
        app.logout();
        app.checkLoginButton();
    }


}
