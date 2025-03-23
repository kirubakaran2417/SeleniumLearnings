package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dummy {

    @Test
    public void test() {
        //this is to open the browser
        WebDriver driver = new ChromeDriver();
        //this is to open the url
        driver.get("https://google.com");
    }
}
