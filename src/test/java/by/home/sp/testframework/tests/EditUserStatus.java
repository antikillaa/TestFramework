package by.home.sp.testframework.tests;

import by.home.sp.testframework.model.ProfileInformationData;
import by.home.sp.testframework.model.StatusInformationData;
import org.testng.annotations.Test;

public class EditUserStatus extends TestBase {

    @Test
    public void testEditUserStatus() {
        app.getProfileHelper().openProfileInformation();
        app.getProfileHelper().openStatusEditPopup();
        app.getProfileHelper().fillStatus(new StatusInformationData("Test status"));
    }


}
