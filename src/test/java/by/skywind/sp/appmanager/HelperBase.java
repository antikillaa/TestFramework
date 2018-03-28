package by.skywind.sp.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {

    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        if(text != null) {
            String existingText = driver.findElement(locator).getAttribute("value");
            if (! text.equals(existingText)){
                driver.findElement(locator).clear();
                driver.findElement(locator).sendKeys(text);
            }
        }
    }

    protected String getValue(By locator) {
        click(locator);
        String value = driver.findElement(locator).getAttribute("value");
        return value;
    }

    protected void clear(By locator) {
        driver.findElement(locator).clear();
    }

    protected void refresh() {
        driver.navigate().refresh();
    }

    protected void wait(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
