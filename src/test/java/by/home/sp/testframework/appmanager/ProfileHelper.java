package by.home.sp.testframework.appmanager;

import by.home.sp.testframework.model.ProfileInformationData;
import by.home.sp.testframework.model.StatusInformationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProfileHelper extends HelperBase {

    public ProfileHelper(WebDriver driver) {
        super(driver);
    }

    public void checkProfileInformation(ProfileInformationData profileInformationData) {
        String nameValue = getValue(By.xpath("//input[@name='name']"));
        Assert.assertEquals(nameValue, profileInformationData.getName());
        String countryValue = getValue(By.xpath("//input[@name='country']"));
        Assert.assertEquals(countryValue, profileInformationData.getCountry());
        String townValue = getValue(By.xpath("//input[@name='town']"));
        Assert.assertEquals(townValue, profileInformationData.getTown());
    }

    public void setProfileInformation(ProfileInformationData profileInformationData) {
        type(By.name("name"), profileInformationData.getName());
        type(By.name("country"), profileInformationData.getCountry());
        type(By.name("town"), profileInformationData.getTown());
        click(By.xpath("//button[@class='send']"));
        try {
            Thread.sleep(Long.parseLong("2000"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clearProfileInformation() {
        clear(By.name("name"));
        clear(By.name("country"));
        clear(By.name("town"));
        click(By.xpath("//button[@class='send']"));
        try {
            Thread.sleep(Long.parseLong("2000"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openProfileInformation() {
        click(By.xpath("//span[@class='username']"));
        click(By.xpath("//div[@class='controllers clearfix']/a[2]"));
    }

    public void openStatusEditPopup() {
        click(By.xpath("//div[@class='controllers clearfix']/a[3]"));
    }

    public void fillStatus(StatusInformationData statusInformationData) {
        type(By.xpath("//div[@class='popup-report']/form/textarea"), statusInformationData.getStatus());
    }
}
