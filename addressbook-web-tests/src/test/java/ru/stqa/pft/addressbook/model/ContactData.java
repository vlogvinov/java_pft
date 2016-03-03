package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String title;
    private final String company;
    private final String firstAddress;
    private final String homePhoneNumber;
    private final String mobilePhoneNumber;
    private final String workPhoneNumber;
    private final String fax;
    private final String mainEmail;
    private final String secondEmail;
    private final String thirdEmail;
    private final String homePage;
    private final String birthDay;
    private final String birthMonth;
    private final String birthYear;
    private final String anniverDay;
    private final String anniverMonth;
    private final String anniverYear;
    private final String secondAddress;
    private final String secondHomePhoneNumber;
    private final String notes;

    public ContactData(String firstName, String middleName, String lastName, String nickName, String title, String company, String firstAddress, String homePhoneNumber, String mobilePhoneNumber, String workPhoneNumber, String fax, String mainEmail, String secondEmail, String thirdEmail, String homePage, String birthDay, String birthMonth, String birthYear, String anniverDay, String anniverMonth, String anniverYear, String secondAddress, String secondHomePhoneNumber, String notes) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.firstAddress = firstAddress;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.workPhoneNumber = workPhoneNumber;
        this.fax = fax;
        this.mainEmail = mainEmail;
        this.secondEmail = secondEmail;
        this.thirdEmail = thirdEmail;
        this.homePage = homePage;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.anniverDay = anniverDay;
        this.anniverMonth = anniverMonth;
        this.anniverYear = anniverYear;
        this.secondAddress = secondAddress;
        this.secondHomePhoneNumber = secondHomePhoneNumber;
        this.notes = notes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getFirstAddress() {
        return firstAddress;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public String getFax() {
        return fax;
    }

    public String getMainEmail() {
        return mainEmail;
    }

    public String getSecondEmail() {
        return secondEmail;
    }

    public String getThirdEmail() {
        return thirdEmail;
    }

    public String getHomePage() {
        return homePage;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getAnniverDay() {
        return anniverDay;
    }

    public String getAnniverMonth() {
        return anniverMonth;
    }

    public String getAnniverYear() {
        return anniverYear;
    }

    public String getSecondAddress() {
        return secondAddress;
    }

    public String getSecondHomePhoneNumber() {
        return secondHomePhoneNumber;
    }

    public String getNotes() {
        return notes;
    }
}
