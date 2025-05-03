package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dummy2Actions {

    @Test
    public void test() {
        WebDriver driver = getWebDriver();
        driver.get("https://jqueryui.com");
        driver.manage().window().maximize();

        WebElement droppableLink= driver.findElement(By.linkText("Droppable"));
        droppableLink.click();
        Actions actions = new Actions(driver);
//        actions.click(droppableLink).build().perform();
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        actions.clickAndHold(draggable).moveToElement(droppable).release(droppable).build().perform();

//        actions.doubleClick().build().perform();
    }

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = getWebDriver();
        driver.get("https://www.linkedin.com/");
        driver.manage().window().maximize();

        //store the parent window handle
        String parentWindowHandle = driver.getWindowHandle();
        Thread.sleep(5000);
       // WebElement frame= driver.findElement(By.cssSelector("iframe#gsi_340204_870200"));
        driver.switchTo().frame(0);
        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("(//span[text()='Continue with Google'])[1]"));
        loginButton.click();
        //iterate through the windows and switch to the child window
        for( String windowHandle : driver.getWindowHandles()) {
            if(!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        driver.findElement(By.id("identifierId")).sendKeys("Selenium");


    }

    @Test
    public void test3() throws InterruptedException {
        WebDriver driver = getWebDriver();
        driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
        driver.manage().window().maximize();
        driver.findElement(By.id("confirm")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    private static WebDriver getWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver= new ChromeDriver(options);
        return driver;
    }
}
