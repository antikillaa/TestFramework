package by.home.sp.testframework.tests;

import by.home.sp.testframework.model.ProfileInformationData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditUserInformationTest extends TestBase {

    @Test
    public void testEditUserInformation() throws Exception {
        app.getProfileHelper().openProfileInformation();
        app.getProfileHelper().setProfileInformation(new ProfileInformationData("Stas", "Belarus", "Minsk"));
        app.getProfileHelper().openProfileInformation();
        app.getProfileHelper().checkProfileInformation(new ProfileInformationData("Stas", "Belarus", "Minsk"));
        app.getProfileHelper().clearProfileInformation();
    }

    @Test
    public void checkGeneralInformationTest() throws Exception {
        app.getProfileHelper().openProfileInformation();
        int countActual = app.getProfileHelper().countGeneralInformation();
        int countExpect = 4;
        Assert.assertEquals(countActual, countExpect);

    }
}
