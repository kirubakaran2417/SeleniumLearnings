package org.example;

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
        Actions actions = new Actions(driver);
        actions.click(droppableLink).build().perform();

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        actions.clickAndHold(draggable).moveToElement(droppable).release(droppable).build().perform();

        actions.doubleClick().build().perform();
    }

    private static WebDriver getWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver= new ChromeDriver(options);
        return driver;
    }
}
