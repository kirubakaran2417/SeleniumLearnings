package myTests;

import basics.BrowserConfig;
import utilities.WebdriverMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testcases {
    WebDriver driver;
    @Test
    public void test() {
         BrowserConfig.getDriver();
        WebdriverMethods wb=new WebdriverMethods(driver);
        wb.openURL("https://google.com");
    }
}
