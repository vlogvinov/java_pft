package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    protected FirefoxDriver browser;

    public void init() {
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openHomePage();
        login("admin", "secret");
    }

    public void stop() {
        browser.quit();
    }

    public void openHomePage() {
        browser.get("http://addressbook/");
    }

    public void login(String username, String password) {
        browser.findElement(By.id("LoginForm")).click();
        browser.findElement(By.name("user")).click();
        browser.findElement(By.name("user")).clear();
        browser.findElement(By.name("user")).sendKeys(username);
        browser.findElement(By.id("LoginForm")).click();
        browser.findElement(By.name("pass")).click();
        browser.findElement(By.name("pass")).clear();
        browser.findElement(By.name("pass")).sendKeys(password);
        browser.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    public void goToGroupsPage() {
        browser.findElement(By.linkText("groups")).click();
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

    public void logout() {
        browser.findElement(By.linkText("Logout")).click();
    }

    public void selectGroup() {
        browser.findElement(By.name("selected[]")).click();
    }

    public void deleteSelectedGroups() {
        browser.findElement(By.name("delete")).click();
    }
}
