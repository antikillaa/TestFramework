package by.by.sp.amazon.tests;

import by.by.sp.amazon.model.LoginData;
import by.home.sp.testframework.model.GamesData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends TestBase {

    @Test
    public void testLogin() throws Exception {
    app.getSessionHelper().login(new LoginData("antikillaaaa@gmail.com", "1342365Pass"));
    }

}
