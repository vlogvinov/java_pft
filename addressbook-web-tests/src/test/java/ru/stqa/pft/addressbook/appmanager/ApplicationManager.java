package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver browser;

    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;

    public void init() {
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openHomePage();
        groupHelper = new GroupHelper(browser);
        navigationHelper = new NavigationHelper(browser);
        sessionHelper = new SessionHelper(browser);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        browser.quit();
    }

    public void openHomePage() {
        browser.get("http://addressbook/");
    }

    public void logout() {
        browser.findElement(By.linkText("Logout")).click();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
