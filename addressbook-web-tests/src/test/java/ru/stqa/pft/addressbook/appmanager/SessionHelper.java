package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper( WebDriver browser) {
        super(browser);
    }

    public void openHomePage() {
        browser.get("http://addressbook/");
    }

    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }

    public void logout() {
        click(By.linkText("Logout"));
    }
}
