package ru.stqa.pft.addressbook.model;


import com.google.gson.annotations.Expose;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("group")
public class GroupData {
    @XStreamOmitField
    private int id;
    @Expose
    private String name;
    @Expose
    private String header;
    @Expose
    private String footer;


    /*         GETTERS             */

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    public int getId() {
        return id;
    }


    /*         SETTERS             */

    public void setName(String name) {
        this.name = name;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void setId(int id) {
        this.id = id;
    }


    /*          FLUENT SETTERS    */

    public GroupData withId(int id) {
        this.id = id;
        return this;
    }

    public GroupData withName(String name) {
        this.name = name;
        return this;
    }

    public GroupData withHeader(String header) {
        this.header = header;
        return this;
    }

    public GroupData withFooter(String footer) {
        this.footer = footer;
        return this;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupData groupData = (GroupData) o;

        if (id != groupData.id) return false;
        return name != null ? name.equals(groupData.name) : groupData.name == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
