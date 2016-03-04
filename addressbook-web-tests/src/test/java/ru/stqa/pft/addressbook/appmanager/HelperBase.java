package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HelperBase {
    protected FirefoxDriver browser;

    public HelperBase(FirefoxDriver browser) {
        this.browser = browser;
    }

    protected void type(By locator, String text) {
        click(locator);
        clear(locator);
        send(locator, text);
    }

    private void send(By locator, String text) {
        browser.findElement(locator).sendKeys(text);
    }

    private void clear(By locator) {
        browser.findElement(locator).clear();
    }

    protected void click(By locator) {
        browser.findElement(locator).click();
    }

    protected void selectValueFromSelector(WebElement selectLocator, String value) {
        Select select = new Select(selectLocator);
        select.selectByValue(value);
    }
}
