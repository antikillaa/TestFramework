package by.home.sp.testframework.appmanager;

import by.home.sp.testframework.model.LoginData;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.fail;

public class ApplicationManager {
    public WebDriver driver;
    private static String driverPath = null;

    private StringBuffer verificationErrors = new StringBuffer();
    private ProfileHelper profileHelper;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private HelperBase helperBase;
    private String browser;

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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://dota2.ru/");
        profileHelper = new ProfileHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login(new LoginData("antikillaaaa@gmail.com", "Password1"));

    }

    public void checkLoginButton() {
        driver.findElement(By.linkText("Вход")).isDisplayed();
    }


    public void logout() {
        helperBase.click(By.xpath("//div[@class='userbar']/a[3]"));
        try {
            Thread.sleep(Long.parseLong("2000"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        helperBase.click(By.id("logoutBtn"));
    }

    public void checkTitle() {

        String Title = driver.getTitle();
        Assert.assertEquals(Title, "Форум Dota 2");
    }


    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public ProfileHelper getProfileHelper() {
        return profileHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

}


