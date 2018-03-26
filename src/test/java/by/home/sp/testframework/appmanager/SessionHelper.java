package by.home.sp.testframework.appmanager;

import by.home.sp.testframework.model.LoginData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);

    }

    public void login(LoginData loginData) {
        driver.get("https://dota2.ru/");
        click(By.linkText("Вход"));
        type(By.id("login_credential"), loginData.getLogin());
        type(By.id("login_password"), loginData.getPassword());
        click(By.id("login_remember_me"));
        click(By.id("loginBtn"));

    }

}
