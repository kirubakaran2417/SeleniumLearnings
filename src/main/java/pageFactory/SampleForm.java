package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleForm {

    WebDriver driver;

    public SampleForm(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    //WebElement element = driver.findElement(By.linkText("Sample Forms"));
    @FindBy(linkText = "Sample Forms")
    public WebElement sampleForms;

    @FindBy(id = "subject")
    public WebElement subject;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id="q3")
    public WebElement dropdown1;
}

