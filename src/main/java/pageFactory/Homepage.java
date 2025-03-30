package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    //Annotations we use in pagefactory
    //1. @FindBy-> this is used to find the element
    //2. @FindBys-> this is used to find the list of elements
    //3. @FindAll-> this is used to find the list of elements

    //pagefactory.initElements(driver, this);--> this is used to initialize the pagefactory class

    WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    //WebElement element = driver.findElement(By.linkText("Sample Forms"));
    @FindBy(linkText = "Sample Forms")
    public WebElement sampleForms;


}
