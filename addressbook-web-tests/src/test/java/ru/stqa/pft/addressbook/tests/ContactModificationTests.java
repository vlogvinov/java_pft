package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.*;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        if(! app.getContactHelper().isThereAContact()) {
            ContactData contact = new ContactData();
            contact.setFirstName("My first name");
            contact.setMiddleName("My middle name");
            contact.setLastName("My last name");
            app.getContactHelper().createContact(contact);
        }
        List<ContactData> before = app.getContactHelper().getContactList();

        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().editSelectedContact();
        ContactData contact = new ContactData();
            contact.setId(before.get(before.size() -1).getId());
            contact.setFirstName("Modified");
            contact.setMiddleName("Modified");
            contact.setLastName("Modified");
        app.getContactHelper().fillContactForm(contact);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();

        before.remove(before.size() - 1);
        before.add(contact);

        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);

        Assert.assertEquals(before, after);
        app.getSessionHelper().logout();
    }
}
