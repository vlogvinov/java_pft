package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver browser) {
        super(browser);
    }

    public void goToGroupsPage() {
        click(By.linkText("groups"));
    }
}
