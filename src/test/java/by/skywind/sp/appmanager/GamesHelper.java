package by.skywind.sp.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GamesHelper extends HelperBase {

    public GamesHelper(WebDriver driver) {
        super(driver);
    }

    public void showSkywindGames() {
        click(By.xpath("//form[@id='filter_gameprovider']/div[@class='btn-group']/label[2]"));
    }


    public int getGameCount() {
        return driver.findElements(By.xpath("//a[@class='open_game btn btn-primary btn-xs']")).size();
    }
}
