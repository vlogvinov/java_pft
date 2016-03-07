package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        if(! app.getContactHelper().isThereAContact()){
            ContactData contact = new ContactData();
            contact.setFirstName("My first name");
            contact.setMiddleName("My middle name");
            contact.setLastName("My last name");
            app.getContactHelper().createContact(contact);
        }
        app.getContactHelper().selectContact();
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
        app.getSessionHelper().logout();
    }
}
