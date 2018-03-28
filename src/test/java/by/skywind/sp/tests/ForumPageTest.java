package by.skywind.sp.tests;

import by.skywind.sp.appmanager.GamesHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForumPageTest extends TestBase {

    @Test
    public void testLaunchGame() throws Exception {

    }


    @Test
    public void testGamesCount() throws Exception{
        Thread.sleep(5000);
        int expGames = app.getGamesHelper().getGameCount();
        int totalGames = 129;
        System.out.println(expGames);
        Assert.assertEquals(totalGames, expGames);
    }

}
