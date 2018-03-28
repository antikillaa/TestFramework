package by.skywind.sp.appmanager;

import by.skywind.sp.model.LoginData;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.fail;

public class ApplicationManager {
    public WebDriver driver;
    private static String driverPath = null;

    private StringBuffer verificationErrors = new StringBuffer();

    private SessionHelper sessionHelper;
    private String browser;



    private GamesHelper gamesHelper;


    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        if(browser.equals(BrowserType.CHROME)) {
            driverPath = FilenameUtils.separatorsToSystem("webdriver//chromedriver");
            System.setProperty("webdriver.chrome.driver", ApplicationManager.driverPath);
            driver = new ChromeDriver();
        } else if(browser.equals(BrowserType.FIREFOX)) {
            driverPath = FilenameUtils.separatorsToSystem("webdriver//geckodriver");
            System.setProperty("webdriver.gecko.driver", ApplicationManager.driverPath);
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

        driver.get("https://test-site.stg.m27613.com/");

        sessionHelper = new SessionHelper(driver);
        sessionHelper.login(new LoginData("Testeri4", "Password1", "{ \"secretKey\": \"a6fcffac-4270-47a9-a821-299a883bd8be\", \"username\": \"swftest2_USER\", \"password\": \"123456qaB\" }"));

    }


    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public GamesHelper getGamesHelper() {
        return gamesHelper;
    }

}


