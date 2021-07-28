package com.TennisExpress.tests;

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

public class TE_DENEME_TEST {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void movetoelement(){
        driver.get("https://www.tennisexpress.com/");
        Actions action2 = new Actions(driver);
        BrowserUtilities.wait(1);
        WebElement element1=driver.findElement(By.xpath("//nav[@class='web-nav']//strong[.=\"Men's Brands\"]"));
        action2.moveToElement(element1).perform();
        BrowserUtilities.wait(3);
    }


    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
