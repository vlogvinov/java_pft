package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class ContactPhoneTests extends TestBase {

    @Test
    public void testContactPhones(){
        app.goTo().homePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().InfoFromEditContact(contact);

        assertThat(contact.getHomePhoneNumber(), equalTo(cleaned(contactInfoFromEditForm.getHomePhoneNumber())));
        assertThat(contact.getMobilePhoneNumber(), equalTo(cleaned(contactInfoFromEditForm.getMobilePhoneNumber())));
        assertThat(contact.getWorkPhoneNumber(), equalTo(cleaned(contactInfoFromEditForm.getWorkPhoneNumber())));
    }

    public String cleaned(String phone){
        return phone.replaceAll("\\s", "").replaceAll("[-()]", "");
    }
}
