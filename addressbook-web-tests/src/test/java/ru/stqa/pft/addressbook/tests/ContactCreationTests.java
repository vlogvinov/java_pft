package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void ContactCreationTests() {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactCreation();
        ContactData contact = new ContactData();
            contact.setCreation(true);
            contact.setFirstName("Vladimir");
            contact.setMiddleName("Vitalievich");
            contact.setLastName("Logvinov");
            contact.setNickName("vlogvinov");
            contact.setTitle("Mr");
            contact.setCompany("P4");
            contact.setFirstAddress("Zakrevskogo street 67");
            contact.setHomePhoneNumber("5469878");
            contact.setMobilePhoneNumber("0639876756");
            contact.setWorkPhoneNumber("0994565678");
            contact.setFax("Fax");
            contact.setMainEmail("volodymyr.logvinov@gmail.com");
            contact.setSecondEmail("my_second_email@gmail.com");
            contact.setThirdEmail("my_thirdemail@gmail.com");
            contact.setHomePage("myhomepage.com");
            contact.setGroupName("my group");
            contact.setSecondAddress("Dmitria Lucenka 13");
            contact.setSecondHomePhoneNumber("5679867");
            contact.setNotes("My super notes");
        app.getContactHelper().fillContactForm(contact);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(before + 1, after);
        app.getSessionHelper().logout();
    }


}
