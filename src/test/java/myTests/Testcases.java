package myTests;

import basics.BrowserConfig;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageFactory.Homepage;
import pageFactory.SampleForm;
import utilities.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testcases {
    WebDriver driver;
    Homepage hp;
    SampleForm sf;
    ReusableMethods rm;

    @BeforeMethod
    public void beforeClass(){
        driver = BrowserConfig.getDriver();
        rm = new ReusableMethods(driver);
        rm.openURL("https://mycontactform.com");

    }
    @Test(description = "this test case is testing sample forms link is landing on correct page")
    public void test() {


        sf = new SampleForm(driver);
        hp = new Homepage(driver);
        rm.clickUsingJavascriptExecutor(hp.sampleForms);
        Assert.assertEquals(rm.getCurrentUrl(), "https://www.mycontactform.com/samples.php");
    }

    @Test
    public void test2(){


        hp = new Homepage(driver);
        sf = new SampleForm(driver);
        rm.clickUsingJavascriptExecutor(hp.sampleForms);
        rm.sendKeys(sf.subject,"hello world");
        rm.sendKeys(sf.email,"bharath123@gmail.com");
        rm.dropdownUsingVisibleText(sf.dropdown1,"Third Option");
    }

//    @AfterMethod
//    public void afterClass(){
//        BrowserConfig.closeDriver();
//    }
}
