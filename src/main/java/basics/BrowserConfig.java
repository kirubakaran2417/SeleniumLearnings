package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserConfig {


    public static WebDriver driver;

    public static WebDriver getDriver() {
        //to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }
}
