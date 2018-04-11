package by.skywind.sp.tests;

import by.home.sp.testframework.model.GamesData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ForumPageTest extends TestBase {

    @Test
    public void testLaunchGame() throws Exception {

    }


    @Test
    public void testGamesCount() throws Exception{
        Thread.sleep(5000);
        List<GamesData> expGames = app.getGamesHelper().getGameList();
        List<GamesData> actGames = app.getGamesHelper().getGameList();
        Assert.assertEquals(actGames.size(), expGames.size());
    }

}
