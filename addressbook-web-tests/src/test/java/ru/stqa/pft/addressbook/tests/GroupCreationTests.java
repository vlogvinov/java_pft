package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("my group", "group header", "group footer"));
        app.submitGroupCreation();
        app.returnToGroupsPage();
        app.logout();
    }

}
