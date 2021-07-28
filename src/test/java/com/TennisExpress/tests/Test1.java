package com.TennisExpress.tests;

import com.TennisExpress.pages.MenuPage;
import com.TennisExpress.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Test1 extends BaseTest {

    @Test
    public void MenuTest() {
        extentTest = extentReports.createTest("Menu Test-1");
        Actions action1 = new Actions(driver);
        BrowserUtilities.wait(3);
        List<WebElement> el = driver.findElements(By.xpath("//nav[@class='web-nav']/a"));

        for (WebElement each : el) {
            action1.moveToElement(each).perform();
            BrowserUtilities.wait(3);
            if (each.getText().equalsIgnoreCase("Your Garage")) {
                each.click();
                extentTest.pass("Done!");

            }
        }

    }

    @Test
    public void MenuTest2() {
        extentTest = extentReports.createTest("Menu Test-1");
        MenuPage menuPage = new MenuPage();
        menuPage.apparelButton.click();
        menuPage.mens.click();
        menuPage.adidas.click();
        menuPage.firstBoxer.click();
        BrowserUtilities.wait(2);
        menuPage.large.click();
//        BrowserUtilities.wait(2);
//        menuPage.addCard.click();

        extentTest.pass("Done!");
    }
}