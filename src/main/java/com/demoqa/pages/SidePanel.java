package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePages{
    public SidePanel(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;
    public AlertsPage selectAlerts() {
        click(alerts);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;
    public BrowserWindowsPage selectBrowserWindows() {
        clickWithJS(browserWindows,0,300);
        return new BrowserWindowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;
    public SelectMenuPage getSelectMenu() {
        click(selectMenu);
        return new SelectMenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;
    public PracticeFormPage selectPracticeForm() {
        clickWithJS(practiceForm,0,300);
        return null;
    }
}
