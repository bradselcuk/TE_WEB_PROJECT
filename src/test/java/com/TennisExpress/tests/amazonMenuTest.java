package Selenium;

import com.TennisExpress.utilities.BrowserFactory;
import com.TennisExpress.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public  class amazonMenuTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test(description ="move to element on amazon")
    public void movetoelement2(){
        driver.get("https://www.amazon.com/");
        Actions action1=new Actions(driver);
        BrowserUtilities.wait(3);
        WebElement element1=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        action1.moveToElement(element1).perform();
        BrowserUtilities.wait(3);
        List<WebElement>el=driver.findElements(By.xpath("//div[@id='nav-al-your-account']/a"));

        for(WebElement each:el){
            action1.moveToElement(each).perform();
            BrowserUtilities.wait(3);
            if(each.getText().equalsIgnoreCase("Your Garage")){
                each.click();
            }
        }

    }


    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
