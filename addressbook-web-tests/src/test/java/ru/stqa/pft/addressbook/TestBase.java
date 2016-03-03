package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected FirefoxDriver browser;

    @BeforeMethod
    public void setUp() throws Exception {
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openHomePage();
        login("admin", "secret");
    }

    @AfterMethod
    public void tearDown() {
        browser.quit();
    }

    protected void openHomePage() {
        browser.get("http://addressbook/");
    }

    protected void login(String username, String password) {
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

    protected void goToGroupsPage() {
        browser.findElement(By.linkText("groups")).click();
    }

    protected void initGroupCreation() {
        browser.findElement(By.name("new")).click();
    }

    protected void fillGroupForm(GroupData group) {
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

    protected void submitGroupCreation() {
        browser.findElement(By.name("submit")).click();
    }

    protected void returnToGroupsPage() {
        browser.findElement(By.linkText("group page")).click();
    }

    protected void logout() {
        browser.findElement(By.linkText("Logout")).click();
    }

    protected void selectGroup() {
        browser.findElement(By.name("selected[]")).click();
    }

    protected void deleteSelectedGroups() {
        browser.findElement(By.name("delete")).click();
    }
}
