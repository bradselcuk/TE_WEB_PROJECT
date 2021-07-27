package com.TennisExpress.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy (xpath = "/html/body/header/div[4]/section/nav/a")
    public WebElement navigation;
}
