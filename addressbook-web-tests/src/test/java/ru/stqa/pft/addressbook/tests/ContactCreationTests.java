package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;
import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {

    @Test
    public void ContactCreationTests() {
        List<ContactData> before = app.contact().list();

        ContactData contact = new ContactData().withId(Integer.MAX_VALUE).withCreation(true).withFirstName("Vladimir")
            .withMiddleName("Vitalievich").withLastName("Logvinov").withNickName("vlogvinov").withTitle("Mr")
            .withCompany("P4").withFirstAddress("Zakrevskogo street 67").withPhoneNumber("5469878")
            .withMobilePhoneNumber("0639876756").withWorkPhoneNumber("0994565678").withFax("Fax")
            .withMainEmail("volodymyr.logvinov@gmail.com").withSecondEmail("my_second_email@gmail.com").withThirdEmail("my_thirdemail@gmail.com")
            .withHomePage("myhomepage.com").withSecondAddress("Dmitria Lucenka 13").withSecondHomePhoneNumber("5679867").withNotes("My super notes");
        app.contact().create(contact);
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(before.size() + 1, after.size());



        contact.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        before.add(contact);

        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);

        Assert.assertEquals(before, after);

        app.getSessionHelper().logout();
    }


}
