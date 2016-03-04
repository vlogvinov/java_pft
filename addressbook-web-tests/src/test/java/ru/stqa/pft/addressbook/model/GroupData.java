package ru.stqa.pft.addressbook.model;

public class GroupData {
    private String name;
    private String header;
    private String footer;

    public GroupData() {

    }

    public GroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

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
}
