package by.home.sp.testframework.tests;

import by.home.sp.testframework.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass
    public void tearDown() {
        app.stop();

    }

}
