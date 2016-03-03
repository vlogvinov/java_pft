package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
    private FirefoxDriver browser;

    public NavigationHelper(FirefoxDriver browser) {
        this.browser = browser;
    }

    public void goToGroupsPage() {
        browser.findElement(By.linkText("groups")).click();
    }
}
