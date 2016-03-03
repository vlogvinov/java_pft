package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper {

    private FirefoxDriver browser;

    public GroupHelper(FirefoxDriver browser) {
        this.browser = browser;
    }

    public void initGroupCreation() {
        browser.findElement(By.name("new")).click();
    }

    public void fillGroupForm(GroupData group) {
        browser.findElement(By.name("group_name")).click();
        browser.findElement(By.name("group_name")).clear();
        browser.findElement(By.name("group_name")).sendKeys(group.getName());
        browser.findElement(By.name("group_header")).click();
        browser.findElement(By.name("group_header")).clear();
        browser.findElement(By.name("group_header")).sendKeys(group.getHeader());
        browser.findElement(By.name("group_footer")).click();
        browser.findElement(By.name("group_footer")).clear();
        browser.findElement(By.name("group_footer")).sendKeys(group.getFooter());
    }

    public void submitGroupCreation() {
        browser.findElement(By.name("submit")).click();
    }

    public void returnToGroupsPage() {
        browser.findElement(By.linkText("group page")).click();
    }

    public void selectGroup() {
        browser.findElement(By.name("selected[]")).click();
    }

    public void deleteSelectedGroups() {
        browser.findElement(By.name("delete")).click();
    }
}
