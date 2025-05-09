package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Dummy {

    @Test
    public void test() {
        //this is to open the browser
        WebDriver driver = getWebDriver();
        //this is to open the url
        driver.get("https://mycontactform.com");
        //another way to open the url
//        driver.navigate().to("https://google.com");
//        driver.navigate().refresh();
//        //navigationAL METHODS

//        driver.navigate().back();
//        driver.navigate().forward();
        //Webdriver methods
        //maximize
        driver.manage().window().maximize();
        //if i want to take currenturl
        String currentUrl = driver.getCurrentUrl();//this method will return the current url as string
        System.out.println(currentUrl);
        //if i want to take title
        String title = driver.getTitle();
        System.out.println(title);
         //if i want to close the browser
        //driver.quit();

        //locators->id, name, class, xpath, css, linktext

        driver.findElement(By.linkText("Sample Forms")).click();

//        WebElement element = driver.findElement(By.linkText("Sample Forms"));
//        element.click();

        WebElement subject= driver.findElement(By.id("subject"));
        subject.sendKeys("hello");//this is the web

        List<WebElement> listOfLinks= driver.findElements(By.tagName("a"));

        //size
        System.out.println("Total number of links: "+listOfLinks.size());

        for(int i=0; i<listOfLinks.size(); i++){
            if (listOfLinks.get(i).getText().equals("Basic Contact Form")){
                listOfLinks.get(i).click();
                break;
            }
        }

        List<WebElement> ele= driver.findElements(By.xpath("//div[@id='left_col_top']//ul//li//a"));
        //total no links
        int totalLinks = ele.size();
        System.out.println("Total number of links: "+totalLinks);
    }

    private static WebDriver getWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver= new ChromeDriver(options);
        return driver;
    }
}
