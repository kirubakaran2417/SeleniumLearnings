package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserConfig {


   private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

//    public static WebDriver getDriver() {
//        //to disable notifications
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        driver= new ChromeDriver(options);
//        driver.manage().window().maximize();
//        return driver;
//    }

    public static WebDriver getDriver() {
        if(driver.get() == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver.set(new ChromeDriver(options));
//            driver.get().manage().window().maximize();
        }
        return driver.get();
    }

    public static WebDriver getDriverinstance() {
        return driver.get();
    }

    public static void closeDriver() {
        if(driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
