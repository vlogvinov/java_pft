package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver browser) {
        super(browser);
    }

    public void groupPage() {
        if (isElementPresent(By.tagName("h1")) && browser.findElement(By.tagName("h1")).getText().equals("Groups") && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
    }

    public void homePage(){
        browser.get("http://addressbook/");
    }
}
