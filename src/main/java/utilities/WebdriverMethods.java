package utilities;

import org.openqa.selenium.WebDriver;

public class WebdriverMethods {

    WebDriver driver;

    public WebdriverMethods(WebDriver driver) {
        this.driver = driver;
    }

    //openURL
    public void openURL(String url) {
        driver.get(url);
    }
    //getTitle
    //getCurrentUrl
    //getPageSource
    //quit
}
