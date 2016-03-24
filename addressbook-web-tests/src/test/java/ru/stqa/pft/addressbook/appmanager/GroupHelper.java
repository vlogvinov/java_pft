package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver browser) {
        super(browser);
    }

    /*
    HIGH LEVEL METHODS -------------------------------------------------------------------------------------------------
    */

    public void create(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupsPage();
    }

    public void modify(GroupData group){
        initGroupModification();
        fillGroupForm(group);
        submitGroupModification();
        returnToGroupsPage();
    }

    public void remove(int index) {
        selectGroup(index);
        deleteSelectedGroups();
        returnToGroupsPage();
    }

    public void remove(GroupData group) {
        selectGroupById(group.getId());
        deleteSelectedGroups();
        returnToGroupsPage();
    }

    /*
    LOW LEVEL METHODS  -------------------------------------------------------------------------------------------------
    */

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void fillGroupForm(GroupData group) {
        type(By.name("group_name"), group.getName());
        type(By.name("group_header"), group.getHeader());
        type(By.name("group_footer"), group.getFooter());
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void returnToGroupsPage() {
        click(By.linkText("group page"));
    }

    public void selectGroup(int index) {
        browser.findElements(By.name("selected[]")).get(index).click();
    }

    private void selectGroupById(int id) {
        browser.findElement(By.xpath("//input[@value='" + id +"']")).click();
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    /*
    ASSERTS ------------------------------------------------------------------------------------------------------------
    */

    public List<GroupData> list() {
        List<GroupData> groups = new ArrayList<GroupData>();
        List<WebElement> elements = browser.findElements(By.xpath("//span[@class='group']"));
        for (WebElement element : elements) {
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            GroupData group = new GroupData().withName(name);
            groups.add(group);
        }
        return groups;
    }

    public Set<GroupData> all() {
        Set<GroupData> groups = new HashSet<GroupData>();
        List<WebElement> elements = browser.findElements(By.xpath("//span[@class='group']"));
        for (WebElement element : elements) {
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            GroupData group = new GroupData().withName(name);
            groups.add(group);
        }
        return groups;
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getGroupCount() {
        return browser.findElements(By.xpath("//input[@type='checkbox']")).size();
    }
}
