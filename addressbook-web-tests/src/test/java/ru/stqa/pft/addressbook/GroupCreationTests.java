package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupCreationTests {
    FirefoxDriver browser;

    @BeforeMethod
    public void setUp() throws Exception {
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        browser.get("http://addressbook/");
        login("admin", "secret");
    }

    @Test
    public void testGroupCreation() {
        goToGroupsPage();
        initGroupCreation();
        fillGroupForm(new GroupData("my group", "group header", "group footer"));
        submitGroupCreation();
        returnToGroupsPage();
        logout();
    }

    @AfterMethod
    public void tearDown() {
        browser.quit();
    }

    private void login(String username, String password) {
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

    private void goToGroupsPage() {
        browser.findElement(By.linkText("groups")).click();
    }

    private void initGroupCreation() {
        browser.findElement(By.name("new")).click();
    }

    private void fillGroupForm(GroupData group) {
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

    private void submitGroupCreation() {
        browser.findElement(By.name("submit")).click();
    }

    private void returnToGroupsPage() {
        browser.findElement(By.linkText("group page")).click();
    }

    private void logout() {
        browser.findElement(By.linkText("Logout")).click();
    }
}
