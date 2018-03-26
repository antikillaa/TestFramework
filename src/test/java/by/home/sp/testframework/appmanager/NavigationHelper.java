package by.home.sp.testframework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToMainPage() {
        driver.get("https://dota2.ru/");
    }

    public void goToForumPage() {
        try {
            Thread.sleep(Long.parseLong("2000"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(new By.ByLinkText("Форум"));

    }
}
