package ru.stqa.pft.addressbook.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;


public class GroupCreationTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().groupPage();
    }

    @Test
    public void testGroupCreation() {
        Set<GroupData> before = app.group().all();

        GroupData group = new GroupData().withName("my group").withHeader("my header").withFooter("my footer");
        app.group().create(group);

        Set<GroupData> after = app.group().all();


        group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
        before.add(group);

        assertThat(after, equalTo(before));

    }

}
