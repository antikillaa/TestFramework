package by.by.sp.amazon.appmanager;

import by.by.sp.amazon.model.LoginData;
import by.home.sp.testframework.appmanager.NavigationHelper;
import by.home.sp.testframework.appmanager.ProfileHelper;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import static java.util.concurrent.TimeUnit.SECONDS;
import static junit.framework.TestCase.fail;

public class ApplicationManager {
    public WebDriver driver;
    private static String driverPath = null;


    private StringBuffer verificationErrors = new StringBuffer();


    private SearchResultsHelper searchResultsHelper;
    private SessionHelper sessionHelper;

    private String browser;


    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        if (browser.equals(BrowserType.CHROME)) {
            driverPath = FilenameUtils.separatorsToSystem("webdriver//chromedriver");
            System.setProperty("webdriver.chrome.driver", ApplicationManager.driverPath);
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driverPath = FilenameUtils.separatorsToSystem("webdriver//geckodriver");
            System.setProperty("webdriver.gecko.driver", ApplicationManager.driverPath);
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        sessionHelper = new SessionHelper(driver);
        searchResultsHelper = new SearchResultsHelper(driver);

        driver.get("https://www.amazon.com");
    }

    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public SearchResultsHelper getSearchResultsHelper() {
        return searchResultsHelper;
    }
}



