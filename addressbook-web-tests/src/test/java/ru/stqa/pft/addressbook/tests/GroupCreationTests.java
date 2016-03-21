package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupCreationTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().groupPage();
    }

    @Test
    public void testGroupCreation() {
        List<GroupData> before = app.group().list();

        GroupData group = new GroupData();
            group.setName("my group");
            group.setHeader("my header");
            group.setFooter("my footer");
        app.group().create(group);

        List<GroupData> after = app.group().list();


        before.add(group);

        Comparator<? super GroupData> byId = (o1, o2) -> Integer.compare(o1.getId(), o2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);

    }

}
