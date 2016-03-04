package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().initGroupCreation();
        GroupData group = new GroupData();
            group.setName("my group");
            group.setHeader("my header");
            group.setFooter("my footer");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();
        app.getSessionHelper().logout();
    }

}
