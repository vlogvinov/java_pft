package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver browser) {
        super(browser);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contact) {
        type(By.name("firstname"), contact.getFirstName());
        type(By.name("middlename"), contact.getMiddleName());
        type(By.name("lastname"), contact.getLastName());
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

/*
        // Birth date
        selectValueFromSelector(driver.findElementByName("bday"), "5");
        selectValueFromSelector(driver.findElementByName("bmonth"), "July");
        type(By.name("byear"), contact.getBirthYear());

        // Anniversary date
        selectValueFromSelector(driver.findElementByName("aday"), "6");
        selectValueFromSelector(driver.findElementByName("amonth"), "February");
        type(By.name("ayear"), contact.getAnniverYear());*/

        /*  group  selector */
     /*   if (contact.getCreation()) {
            System.out.println(contact.getCreation());
            new Select(browser.findElement(By.name("new_group"))).selectByVisibleText(contact.getGroupName());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new group")));
        }*/

        type(By.name("address2"), contact.getSecondAddress());
        type(By.name("phone2"), contact.getSecondHomePhoneNumber());
        type(By.name("notes"), contact.getNotes());

    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void returnToHomePage() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
        click(By.linkText("home page"));
    }

    public void selectContact(int index) {
        browser.findElements(By.xpath("//input[@type='checkbox' and @name='selected[]']")).get(index).click();
    }

    public void editSelectedContact() {
        click(By.xpath("//tr[2]/td[8]//img"));
    }

    public void submitContactModification() {
        click(By.xpath("//input[@value='Update'][2]"));
    }

    public void removeContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();
    }

    public int getContactCount() {
        return browser.findElements(By.xpath("//input[@type='checkbox' and @name='selected[]']")).size();
    }

    public List<ContactData> list() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = browser.findElements(By.xpath("//tr[@name='entry']"));
        for (WebElement element : elements) {
            int id = Integer.parseInt(element.findElement(By.xpath("td[1]/input")).getAttribute("value"));
            String firstName = element.findElement(By.xpath("td[3]")).getText();
            String lastName = element.findElement(By.xpath("td[2]")).getText();
            String address = element.findElement(By.xpath("td[4]")).getText();
            String mainEmail = element.findElement(By.xpath("td[5]/a[1]")).getText();

            ContactData contact = new ContactData().withId(id).withFirstName(firstName).withLastName(lastName)
                    .withFirstAddress(address).withMainEmail(mainEmail);
            contacts.add(contact);
        }

        return contacts;
    }

    public Set<ContactData> all() {
        Set<ContactData> contacts = new HashSet<ContactData>();
        List<WebElement> elements = browser.findElements(By.xpath("//tr[@name='entry']"));
        for (WebElement element : elements) {
            int id = Integer.parseInt(element.findElement(By.xpath("td[1]/input")).getAttribute("value"));
            String firstName = element.findElement(By.xpath("td[3]")).getText();
            String lastName = element.findElement(By.xpath("td[2]")).getText();
            String address = element.findElement(By.xpath("td[4]")).getText();
            String mainEmail = element.findElement(By.xpath("td[5]/a[1]")).getText();

            ContactData contact = new ContactData().withId(id).withFirstName(firstName).withLastName(lastName)
                    .withFirstAddress(address).withMainEmail(mainEmail);
            contacts.add(contact);
        }

        return contacts;
    }

    /*
    Hight-levle
     */
    public void create(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();
    }

    public void delete(int index) {
        selectContact(index);
        editSelectedContact();
        removeContact();
    }

    public void modify(ContactData contact) {
        selectContactById(contact.getId());
        editSelectedContact();
        fillContactForm(contact);
        submitContactModification();
        returnToHomePage();

    }

    public void delete(ContactData contact) {
        selectContactById(contact.getId());
        editSelectedContact();
        removeContact();
    }

    private void selectContactById(int id) {
        browser.findElement(By.xpath("//tr[@name='entry']//input[@id='" + id + "']")).click();
    }
}
