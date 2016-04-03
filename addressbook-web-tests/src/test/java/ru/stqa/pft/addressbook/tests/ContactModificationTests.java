package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.*;

public class ContactModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (app.contact().list().size() == 0) {
            ContactData contact = new ContactData().withFirstName("My first name").withMiddleName("My middle name").withLastName("My last name");
            app.contact().createContact(contact);
        }
    }

    @Test
    public void testContactModification() {
        Set<ContactData> before = app.contact().all();

        ContactData modifiedContact = before.iterator().next();
        ContactData contact = new ContactData().withId(modifiedContact.getId()).withFirstName("Modified").withMiddleName("Modified").withLastName("Modified");
        app.contact().modify(contact);

        Set<ContactData> after = app.contact().all();


        before.remove(modifiedContact);
        before.add(contact);


        Assert.assertEquals(before, after);
    }
}
