package com.TennisExpress.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage{

    @FindBy(xpath = "//nav[@class='web-nav']/a[contains(.,'Apparel')]")
    public WebElement apparelButton;
    @FindBy(xpath = "//nav[@class='web-nav']//strong[.=\"Men's Brands\"]")
    public WebElement menBrandButton;
    @FindBy(xpath = "//section[@id='sideNav']/nav[1]/div[@class='holder']/a[1]")
    public WebElement mens;
    @FindBy(xpath = "//a[contains(.,'ADIDAS')]")
    public WebElement adidas;
    @FindBy(css = "[alt='Men`s Stretch Cotton Boxer Briefs 3 Pack Onix and Black']")
    public WebElement firstBoxer;
    @FindBy(xpath = "//a[contains(.,'LARGE')]")
    public WebElement large;
    @FindBy (css = ".addToCart")
    public WebElement addCard;


}
