package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void ContactCreationTests() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(
                new ContactData("Vladimir", "Vitalievich", "Logvinov", "vlogvinov", "Mr.", "P4", "Zakrevskogo street 67", "5469878", "0639876756", "0994565678", "Fax", "volodymyr.logvinov@gmail.com", "my_second_email@gmail.com", "my_thirdemail@gmail.com", "myhomepage.com", "4", "4", "1993", "3", "2", "2003", "Dmitria Lucenka 13", "5679867", "My super notes"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }


}
