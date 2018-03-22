import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {

    ChromeDriver driver;
    private static final String driverPath = FilenameUtils.separatorsToSystem("webdriver//chromedriver");

    @BeforeMethod
    public void start() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }


    @Test(priority = 1)
    public void LoginLogoutAcrossPopup() {
        driver.get("http://stgwp.stg.m27613.com");
        driver.findElement(By.name("username")).sendKeys("Testeri4");
        driver.findElement(By.name("password")).sendKeys("Zasatec}{123");
        driver.findElement(By.name("password")).submit();

        driver.findElement(By.xpath("//div[@class='site']//div[@class='site-header-lower-container']" +
                "//div[@class='site-header-columns site-container']" +
                "//div[@class='site-header-loggedin-container flyout-layer']" +
                "//div[@class='site-header-user-nav']" +
                "//div[@class='site-header-user-nav-icon']")).click();

        driver.findElement(By.linkText("Logout")).click();
    }



    @AfterMethod
    public void stop(){
        driver.quit();
    }

}
