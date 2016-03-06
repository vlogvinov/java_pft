package ru.stqa.pft.addressbook.model;

public class ContactData {
    private Boolean creation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;
    private String title;
    private String company;
    private String firstAddress;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String workPhoneNumber;
    private String fax;
    private String mainEmail;
    private String secondEmail;
    private String thirdEmail;
    private String homePage;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private String anniverDay;
    private String anniverMonth;
    private String anniverYear;
    private String groupName;
    private String secondAddress;
    private String secondHomePhoneNumber;
    private String notes;

    public ContactData() {

    }

    public ContactData(Boolean creation, String firstName, String middleName, String lastName, String nickName, String title, String company, String firstAddress, String homePhoneNumber, String mobilePhoneNumber, String workPhoneNumber, String fax, String mainEmail, String secondEmail, String thirdEmail, String homePage, String birthDay, String birthMonth, String birthYear, String anniverDay, String anniverMonth, String anniverYear, String groupName, String secondAddress, String secondHomePhoneNumber, String notes) {
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
        this.groupName = groupName;
        this.secondAddress = secondAddress;
        this.secondHomePhoneNumber = secondHomePhoneNumber;
        this.notes = notes;
    }


    /*                      GETTERS                                 */
    public Boolean getCreation() {
        return creation;
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

    public String getGroupName() {
        return groupName;
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



    /*          SETTERS                  */

    public void setCreation(Boolean creation) {
        this.creation = creation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setFirstAddress(String firstAddress) {
        this.firstAddress = firstAddress;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setMainEmail(String mainEmail) {
        this.mainEmail = mainEmail;
    }

    public void setSecondEmail(String secondEmail) {
        this.secondEmail = secondEmail;
    }

    public void setThirdEmail(String thirdEmail) {
        this.thirdEmail = thirdEmail;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public void setAnniverDay(String anniverDay) {
        this.anniverDay = anniverDay;
    }

    public void setAnniverMonth(String anniverMonth) {
        this.anniverMonth = anniverMonth;
    }

    public void setAnniverYear(String anniverYear) {
        this.anniverYear = anniverYear;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setSecondAddress(String secondAddress) {
        this.secondAddress = secondAddress;
    }

    public void setSecondHomePhoneNumber(String secondHomePhoneNumber) {
        this.secondHomePhoneNumber = secondHomePhoneNumber;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
