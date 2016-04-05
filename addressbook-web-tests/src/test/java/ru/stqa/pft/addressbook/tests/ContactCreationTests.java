package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.File;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class ContactCreationTests extends TestBase {

    @Test
    public void ContactCreationTests() {
       Contacts before = app.contact().all();

        File photo = new File("src/test/resources/checkout.png");
        ContactData contact = new ContactData().withId(Integer.MAX_VALUE).withCreation(true).withFirstName("Vladimir")
            .withMiddleName("Vitalievich").withLastName("Logvinov").withNickName("vlogvinov").withTitle("Mr")
            .withCompany("P4").withFirstAddress("Zakrevskogo street 67").withPhoneNumber("5469878")
            .withMobilePhoneNumber("0639876756").withWorkPhoneNumber("0994565678").withFax("Fax")
            .withMainEmail("volodymyr.logvinov@gmail.com").withSecondEmail("my_second_email@gmail.com").withThirdEmail("my_thirdemail@gmail.com")
            .withHomePage("myhomepage.com").withSecondAddress("Dmitria Lucenka 13").withSecondHomePhoneNumber("5679867").withNotes("My super notes").withPhoto(photo);
        app.contact().create(contact);
        assertThat(app.contact().count(), equalTo(before.size() + 1));
        Contacts after = app.contact().all();
        assertThat(after, equalTo(before.withAdded(contact.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    }
}
