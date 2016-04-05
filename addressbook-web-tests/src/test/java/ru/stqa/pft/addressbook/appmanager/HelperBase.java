package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class HelperBase {
    protected WebDriver browser;

    public HelperBase(WebDriver browser) {
        this.browser = browser;
    }

    protected void type(By locator, String text) {
        if (text != null) {
            String existingText = browser.findElement(locator).getAttribute("value");
            if (!text.equals(existingText)) {
                click(locator);
                clear(locator);
                send(locator, text);
            }
        }
    }

    protected void attach(By locator, File file) {
        if (file != null) {
            send(locator, file.getAbsolutePath());
        }
    }

    private void send(By locator, String text) {
        if (text != null)
            browser.findElement(locator).sendKeys(text);
    }

    private void clear(By locator) {
        browser.findElement(locator).clear();
    }

    protected void click(By locator) {
        browser.findElement(locator).click();
    }

    protected boolean isElementPresent(By locator) {
        try {
            browser.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
