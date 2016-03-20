package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

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
        int before = app.getContactHelper().getContactCount();

        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().editSelectedContact();
        ContactData contact = new ContactData();
            contact.setCreation(false);
            contact.setFirstName("Modified");
            contact.setMiddleName("Modified");
            contact.setLastName("Modified");
            contact.setGroupName(null);
        app.getContactHelper().fillContactForm(contact);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(before, after);
        app.getSessionHelper().logout();
    }
}
