package by.skywind.sp.appmanager;

import by.home.sp.testframework.model.GamesData;
import by.home.sp.testframework.model.LoginData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GamesHelper extends HelperBase {

    public GamesHelper(WebDriver driver) {
        super(driver);
    }

    public void showSkywindGames() {
        click(By.xpath("//form[@id='filter_gameprovider']/div[@class='btn-group']/label[2]"));
    }


    public int getGameCount() {
        return driver.findElements(By.xpath("//div[@class='btn-group']/label")).size();
    }

    public int countGeneralInformation() {
        return driver.findElements(By.xpath("//ul[@class='list-group row']/li")).size();
    }

    public List<GamesData> getGameList() {
        List<GamesData> games = new ArrayList<GamesData>();
        List<WebElement> elements = driver.findElements(By.cssSelector("a.open_game open_game_text"));
        for (WebElement element : elements) {
            String gameName = element.getText();
            GamesData game = new GamesData(gameName);
            games.add(game);
        }
        return games;
    }
}
