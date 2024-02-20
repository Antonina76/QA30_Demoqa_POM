package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePages{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css=".card:nth-child(3)")
    WebElement alertsFrameWindows;
    public SidePanel getAlertsFrameWindows() {
        click( alertsFrameWindows);
        return new SidePanel(driver);
    }
    @FindBy(css=".fc-button-label")
    WebElement consent;
    public HomePage conformCookies(){
        click(consent);
    return this;
    }
}
