package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactCreationTests extends TestBase {

    @Test
    public void ContactCreationTests() {
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().initContactCreation();
        ContactData contact = new ContactData();
            contact.setCreation(true);
            contact.setFirstName("Vladimir");
            contact.setMiddleName("Vitalievich");
            contact.setLastName("Logvinov");
            contact.setNickName("vlogvinov");
            contact.setTitle("Mr");
            contact.setCompany("P4");
            contact.setFirstAddress("Zakrevskogo street 67");
            contact.setHomePhoneNumber("5469878");
            contact.setMobilePhoneNumber("0639876756");
            contact.setWorkPhoneNumber("0994565678");
            contact.setFax("Fax");
            contact.setMainEmail("volodymyr.logvinov@gmail.com");
            contact.setSecondEmail("my_second_email@gmail.com");
            contact.setThirdEmail("my_thirdemail@gmail.com");
            contact.setHomePage("myhomepage.com");
            contact.setGroupName("my group");
            contact.setSecondAddress("Dmitria Lucenka 13");
            contact.setSecondHomePhoneNumber("5679867");
            contact.setNotes("My super notes");
        app.getContactHelper().fillContactForm(contact);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(before.size() + 1, after.size());


      /*  int max = 0;
        for(ContactData c : after ){
            if(c.getId() > max){
                max = c.getId();
            }
        }*/

       /* Comparator<? super ContactData> ById = new Comparator<ContactData>() {
            @Override
            public int compare(ContactData o1, ContactData o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        };*/




        contact.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        before.add(contact);

        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

        app.getSessionHelper().logout();
    }


}
