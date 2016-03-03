package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
    public ContactHelper(FirefoxDriver browser) {
        super(browser);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contact) {
        type(By.name("firstname"), contact.getFirstName());
        type(By.name("middlename"), contact.getMiddleName());
        type(By.name("middlename"), contact.getLastName());
        type(By.name("nickname"), contact.getNickName());

        /* photo field */
        type(By.name("title"), contact.getTitle());
        type(By.name("company"), contact.getCompany());
        type(By.name("address"), contact.getFirstAddress());
        type(By.name("home"), contact.getHomePhoneNumber());
        type(By.name("mobile"), contact.getMobilePhoneNumber());
        type(By.name("work"), contact.getWorkPhoneNumber());
        type(By.name("fax"), contact.getFax());
        type(By.name("email"), contact.getMainEmail());
        type(By.name("email2"), contact.getSecondEmail());
        type(By.name("email3"), contact.getThirdEmail());
        type(By.name("homepage"), contact.getHomePage());

        // Birth date
        if (!browser.findElement(By.xpath("//div[@id='content']/form/select[1]//option[" + contact.getBirthDay() + "]")).isSelected()) {
            browser.findElement(By.xpath("//div[@id='content']/form/select[1]//option[" + contact.getBirthDay() + "]")).click();
        }
        if (!browser.findElement(By.xpath("//div[@id='content']/form/select[2]//option[" + contact.getBirthMonth() + "]")).isSelected()) {
            browser.findElement(By.xpath("//div[@id='content']/form/select[2]//option[" + contact.getBirthMonth() + "]")).click();
        }
        type(By.name("byear"), contact.getBirthYear());

        // Anniversary date
        if (!browser.findElement(By.xpath("//div[@id='content']/form/select[3]//option[" + contact.getAnniverDay() + "]")).isSelected()) {
            browser.findElement(By.xpath("//div[@id='content']/form/select[3]//option[" + contact.getAnniverDay() + "]")).click();
        }
        if (!browser.findElement(By.xpath("//div[@id='content']/form/select[4]//option[" + contact.getAnniverMonth() + "]")).isSelected()) {
            browser.findElement(By.xpath("//div[@id='content']/form/select[4]//option[" + contact.getAnniverMonth() + "]")).click();
        }
        type(By.name("ayear"), contact.getAnniverYear());

        /*  group  selector */

        type(By.name("address2"), contact.getSecondAddress());
        type(By.name("phone2"), contact.getSecondHomePhoneNumber());
        type(By.name("notes"), contact.getNotes());

    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }
}
