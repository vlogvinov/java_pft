package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        app.getContactHelper().selectContact();
        app.getContactHelper().editSelectedContact();
        ContactData contact = new ContactData();
            contact.setFirstName("Modified");
            contact.setMiddleName("Modified");
            contact.setLastName("Modified");
        app.getContactHelper().fillContactForm(contact);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
        app.getSessionHelper().logout();
    }
}
