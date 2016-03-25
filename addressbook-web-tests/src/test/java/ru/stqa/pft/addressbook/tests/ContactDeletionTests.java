package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {
    @Test(enabled = true)
    public void testContactDeletion() {
        if (!app.contact().isThereAContact()) {
            ContactData contact = new ContactData();
            contact.setFirstName("My first name");
            contact.setMiddleName("My middle name");
            contact.setLastName("My last name");
            app.contact().createContact(contact);
        }
        List<ContactData> before = app.contact().list();
        System.out.println(before);
        System.out.println(before.size());
        int index = before.size();
        app.contact().delete(index);
        List<ContactData> after = app.contact().list();

        before.remove(index);
        System.out.println(before.size());
        System.out.println(after.size());
            Assert.assertEquals(after, after);

        app.getSessionHelper().logout();
    }
}
