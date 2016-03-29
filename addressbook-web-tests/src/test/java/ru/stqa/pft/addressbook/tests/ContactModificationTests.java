package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.*;

public class ContactModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        if(app.contact().list().size() == 0) {
            ContactData contact = new ContactData().withFirstName("My first name").withMiddleName("My middle name").withLastName("My last name");
            app.contact().createContact(contact);
        }
    }

    @Test
    public void testContactModification(){
        List<ContactData> before = app.contact().list();

        int index = before.size() - 1;
        ContactData contact = new ContactData().withId(before.get(index).getId()).withFirstName("Modified").withMiddleName("Modified").withLastName("Modified");
        app.contact().modify(index, contact);

        List<ContactData> after = app.contact().list();


        before.remove(index);
        before.add(contact);

        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);

        Assert.assertEquals(before, after);
        app.getSessionHelper().logout();
    }
}
