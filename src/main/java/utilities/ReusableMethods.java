package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        element.click();
    }
}
