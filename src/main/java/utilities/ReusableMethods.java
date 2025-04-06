package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableMethods {

    WebDriver driver;

    public ReusableMethods(WebDriver driver) {
        this.driver = driver;
    }
    public void openURL(String url) {
        driver.get(url);
    }
    //getTitle
    public String getTitle() {
        return driver.getTitle();
    }
    //getCurrentUrl
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    //quit vs close
    //close-closes the current window or tab
    //quit-closes the entire browser session
    public void quit() {
        driver.quit();
    }
    //normal click method
    public void click(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    //another way to click when we face stale element exception
    public void clickUsingJavascriptExecutor(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
    //normal sendkeys method
    public void sendKeys(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void dropdownUsingVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
}
