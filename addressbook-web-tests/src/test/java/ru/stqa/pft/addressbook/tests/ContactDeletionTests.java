package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        if (app.contact().list().size() == 0) {
            ContactData contact = new ContactData().withFirstName("My first name").withMiddleName("My middle name").withLastName("My last name");
            app.contact().createContact(contact);
        }
    }

    @Test
    public void testContactDeletion() {
        List<ContactData> before = app.contact().list();

        int index = before.size() - 1;
        app.contact().delete(index);
        List<ContactData> after = app.contact().list();

        before.remove(index);

        Assert.assertEquals(after, after);

        app.getSessionHelper().logout();
    }
}
