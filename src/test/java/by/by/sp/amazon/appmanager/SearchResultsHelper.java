package by.by.sp.amazon.appmanager;

import by.by.sp.amazon.model.LoginData;
import by.by.sp.amazon.model.SearchData;
import by.home.sp.testframework.model.GamesData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsHelper extends HelperBase {

    public SearchResultsHelper(WebDriver driver) {
        super(driver);
    }

    public int getSearchResultsCount() {
        return driver.findElements(By.xpath("//div[@id='centerMinus']/div[@id='atfResults']/ul/li")).size();
    }


    public void search(SearchData searchData) {
        type(By.xpath("//input[@id='twotabsearchtextbox']"), searchData.getSearchText());
        submit(By.xpath("//input[@id='twotabsearchtextbox']"));
    }


}
