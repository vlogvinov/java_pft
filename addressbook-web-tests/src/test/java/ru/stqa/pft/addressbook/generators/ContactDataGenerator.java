package ru.stqa.pft.addressbook.generators;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ContactDataGenerator {

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(args[0]);
        File file = new File(args[1]);

        List<ContactData> contacts = generateContacts(count);
        saveAsJson(contacts, file);

    }

    private static List<ContactData> generateContacts(int count) {
        List<ContactData> contacts = new ArrayList<ContactData>();
        for (int i = 0; i < count; i++){
            contacts.add(new ContactData()
                    .withFirstName(String.format("firstname %s", i))
                    .withMiddleName(String.format("middlename %s", i))
                    .withLastName(String.format("lastname %s", i))
                    .withNickName(String.format("nickname %s", i))
                    .withTitle(String.format("title %s", i))
                    .withCompany(String.format("company %s", i))
                    .withFirstAddress(String.format("firstaddress %s", i))
                    .withPhoneNumber(String.format("0636773421 %s", i))
                    .withMobilePhoneNumber(String.format("04454543232 %s", i))
                    .withWorkPhoneNumber(String.format("097463232 %s", i))
                    .withFax(String.format(" %s", i))
                    .withMainEmail(String.format("email%s@gmail.com", i))
                    .withSecondEmail(String.format("secondEmail%s@gmail.com", i))
                    .withThirdEmail(String.format("thirdEmail%s@gmail.com", i))
                    .withHomePage(String.format("myhomepage%s.com", i))
                    .withBirthDay("22")
                    .withBirthMonth("06")
                    .withBirthDay("2000")
                    .withAnniverDay("22")
                    .withAnniverMonth("06")
                    .withAnniverYear("2007")
                    .withSecondAddress(String.format("My second address %s", i))
                    .withSecondHomePhoneNumber(String.format("0987673420 %s", i))
                    .withNotes(String.format("Some notes %s", i)));

        }
        return contacts;

    }
    public static void saveAsXml(List<ContactData> contacts, File file) throws IOException {
        XStream xstream = new XStream();
        xstream.processAnnotations(ContactData.class);
        String xml = xstream.toXML(contacts);
        try (Writer writer = new FileWriter(file)) {
            writer.write(xml);
        }
    }

    public static void saveAsJson(List<ContactData> contacts, File file) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
        String json = gson.toJson(contacts);
        try (Writer writer = new FileWriter(file)) {
            writer.write(json);
        }
    }


}
