package by.by.sp.amazon.appmanager;

import by.by.sp.amazon.model.LoginData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);

    }

    public void login(LoginData loginData){

        click(By.xpath("//a[@id='nav-link-accountList']/span"));
        type(By.name("email"), loginData.getLogin()) ;
        submit(By.name("email"));
        type(By.name("password"), loginData.getPassword()) ;
        submit(By.name("password"));



    }

}
