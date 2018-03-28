package by.skywind.sp.appmanager;

import by.skywind.sp.model.LoginData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);

    }

    public void login(LoginData loginData){
        //WebDriverWait wait=new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.visibilityOf(By.xpath( "//div[@class='form-group']/textarea[1]"), loginData.getManagerCredential()));
        //type(By.xpath(""), loginData.getManagerCredential());
        //wait(By.xpath("//div[@class='form-group']/textarea[1]"));
        wait(By.xpath("//div[@class='form-group']/textarea[1]"));
        type(By.xpath("//div[@class='form-group']/textarea[1]"), loginData.getManagerCredential());

        wait(By.xpath("//button[@class='btn btn-primary']"));
        click(By.xpath("//button[@class='btn btn-primary']"));

        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        wait(By.xpath("//form[2]/button[@class='btn btn-success']"));
        click(By.xpath("//form[2]/button[@class='btn btn-success']"));

        wait(By.id("sign_username"));
        type(By.id("sign_username"), loginData.getLogin());
        type(By.id("sign_password"), loginData.getPassword());
        click(By.xpath("//button[@class='btn btn-block btn-primary']"));
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

    }

}
