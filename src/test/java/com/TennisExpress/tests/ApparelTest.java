package com.TennisExpress.tests;


import com.TennisExpress.pages.ApparelPage;
import com.TennisExpress.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ApparelTest extends BaseTest {

    @Test
    public void apparel() {
        extentTest = extentReports.createTest("Vxxxxx");

        BrowserUtilities.waitForPageToLoad(10);
        WebElement agreeButton = driver.findElement(By.cssSelector(".agree"));
        agreeButton.click();
        ApparelPage apparelPage = new ApparelPage();
        apparelPage.apparelButton.click();
        WebElement element = driver.findElement(By.xpath("//section[@id='sideNav']/nav[1]/div[@class='holder']/a[1]"));
        element.click();
        extentTest.pass("xxx");

    }
}

