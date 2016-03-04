package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        GroupData group = new GroupData();
            group.setName("Modified");
            group.setHeader("Modified");
            group.setFooter("Modified");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupsPage();
        app.getSessionHelper().logout();

    }
}
