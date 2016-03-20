package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion() {
        if (!app.getContactHelper().isThereAContact()) {
            ContactData contact = new ContactData();
            contact.setFirstName("My first name");
            contact.setMiddleName("My middle name");
            contact.setLastName("My last name");
            app.getContactHelper().createContact(contact);
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContact();
        app.getContactHelper().editSelectedContact();
        app.getContactHelper().removeContact();
        app.getNavigationHelper().goToHomePae();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(before - 1, after);
        app.getSessionHelper().logout();
    }
}
