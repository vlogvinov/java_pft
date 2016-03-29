package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class ContactCreationTests extends TestBase {

    @Test
    public void ContactCreationTests() {
        Set<ContactData> before = app.contact().all();

        ContactData contact = new ContactData().withId(Integer.MAX_VALUE).withCreation(true).withFirstName("Vladimir")
            .withMiddleName("Vitalievich").withLastName("Logvinov").withNickName("vlogvinov").withTitle("Mr")
            .withCompany("P4").withFirstAddress("Zakrevskogo street 67").withPhoneNumber("5469878")
            .withMobilePhoneNumber("0639876756").withWorkPhoneNumber("0994565678").withFax("Fax")
            .withMainEmail("volodymyr.logvinov@gmail.com").withSecondEmail("my_second_email@gmail.com").withThirdEmail("my_thirdemail@gmail.com")
            .withHomePage("myhomepage.com").withSecondAddress("Dmitria Lucenka 13").withSecondHomePhoneNumber("5679867").withNotes("My super notes");
        app.contact().create(contact);
        Set<ContactData> after = app.contact().all();

        contact.setId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
        before.add(contact);

        Assert.assertEquals(before, after);
    }


}
