package com.TennisExpress.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparelPage extends BasePage{

    @FindBy(xpath = "//nav[@class='web-nav']/a[contains(.,'Apparel')]")
    public WebElement apparelButton;
    @FindBy(xpath = "//nav[@class='web-nav']//strong[.=\"Men's Brands\"]")
    public WebElement menBrandButton;
    @FindBy(xpath = "//nav[@class='web-nav']//a[@href='/mens-nike-tennis-apparel']")
    public WebElement nikeButton;

}
