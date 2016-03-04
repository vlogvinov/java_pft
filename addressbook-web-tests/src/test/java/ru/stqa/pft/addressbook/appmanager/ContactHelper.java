package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
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
        selectValueFromSelector(browser.findElementByName("bday"), "5");
        selectValueFromSelector(browser.findElementByName("bmonth"), "July");
        type(By.name("byear"), contact.getBirthYear());

        // Anniversary date
        selectValueFromSelector(browser.findElementByName("aday"), "6");
        selectValueFromSelector(browser.findElementByName("amonth"), "February");
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
