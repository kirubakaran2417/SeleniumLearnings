package myTests;

import basics.BrowserConfig;
import org.testng.Assert;
import pageFactory.Homepage;
import utilities.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testcases {
    WebDriver driver;
    Homepage hp;
    ReusableMethods rm;

    @Test(description = "this test case is testing sample forms link is landing on correct page")
    public void test() {
        driver = BrowserConfig.getDriver();
        rm = new ReusableMethods(driver);
        rm.openURL("https://mycontactform.com");
        hp = new Homepage(driver);
        rm.click(hp.sampleForms);
        Assert.assertEquals(rm.getCurrentUrl(), "https://www.mycontactform.com/samples.php");
    }
}
