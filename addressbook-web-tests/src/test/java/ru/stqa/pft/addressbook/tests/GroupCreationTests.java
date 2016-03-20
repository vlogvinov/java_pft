package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupsPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().initGroupCreation();
        GroupData group = new GroupData();
        group.setName("my group");
        group.setHeader("my header");
        group.setFooter("my footer");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);


        before.add(group);

        Comparator<? super GroupData> byId = (o1, o2) -> Integer.compare(o1.getId(), o2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);

        app.getSessionHelper().logout();
    }

}
