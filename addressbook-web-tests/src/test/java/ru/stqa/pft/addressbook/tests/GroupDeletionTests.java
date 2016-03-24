package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;
import java.util.Set;

public class GroupDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().groupPage();
        if(app.group().list().size() == 0){
            app.group().create(new GroupData().withHeader("Group name").withHeader("Group header").withFooter("Group footer"));
        }
    }

    @Test
    public void testGroupDeletion() {
        Set<GroupData> before = app.group().all();
        GroupData deletedGroup = before.iterator().next();


        app.group().remove(deletedGroup);

        Set<GroupData> after = app.group().all();

        before.remove(deletedGroup);

        Assert.assertEquals(after, before);

    }

}
