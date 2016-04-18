package ru.stqa.pft.addressbook.model;

import java.io.File;

public class ContactData {
    private int id;
    private Boolean creation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;
    private File photo;
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
    private String allPhones;

    /*                      GETTERS                                 */
    public int getId() {
        return id;
    }

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

    public File getPhoto(){
        return photo;
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

    public String getAllPhones() {
        return allPhones;
    }


    /*          SETTERS                  */

    public void setId(int id) {
        this.id = id;
    }

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

    public void setPhoto(File photo){this.photo = photo;}

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

    public void setAllPhones(String allPhones) {
        this.allPhones = allPhones;
    }


    /*          FLUENT SETTERS    */

    public ContactData withId(int id){
        this.id = id;
        return this;
    }

    public ContactData withCreation(Boolean creation){
        this.creation = creation;
        return this;
    }

    public ContactData withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public ContactData withMiddleName(String middleName){
        this.middleName = middleName;
        return this;
    }

    public ContactData withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public ContactData withNickName(String nickName){
        this.nickName = nickName;
        return this;
    }

    public ContactData withPhoto(File photo){
        this.photo = photo;
        return this;
    }

    public ContactData withTitle(String title){
        this.title = title;
        return this;
    }

    public ContactData withCompany(String company){
        this.company = company;
        return this;
    }

    public ContactData withFirstAddress(String firstAddress){
        this.firstAddress = firstAddress;
        return this;
    }

    public ContactData withPhoneNumber(String homePhoneNumber){
        this.homePhoneNumber = homePhoneNumber;
        return this;
    }

    public ContactData withMobilePhoneNumber(String mobilePhoneNumber){
        this.mobilePhoneNumber = mobilePhoneNumber;
        return this;
    }
    public ContactData withWorkPhoneNumber(String workPhoneNumber){
        this.workPhoneNumber = workPhoneNumber;
        return this;
    }

    public ContactData withFax(String fax){
        this.fax = fax;
        return this;
    }

    public ContactData withMainEmail(String mainEmail){
        this.mainEmail = mainEmail;
        return this;
    }

    public ContactData withSecondEmail(String secondEmail){
        this.secondEmail = secondEmail;
        return this;
    }

    public ContactData withThirdEmail(String thirdEmail){
        this.thirdEmail = thirdEmail;
        return this;
    }

    public ContactData withHomePage(String homePage){
        this.homePage = homePage;
        return this;
    }

    public ContactData withBirthDay(String birthDay){
        this.birthDay = birthDay;
        return this;
    }

    public ContactData withBirthMonth(String birthMonth){
        this.birthDay = birthMonth;
        return this;
    }

    public ContactData withBirthYear(String birthYear){
        this.birthYear = birthYear;
        return this;
    }

    public ContactData withAnniverDay(String anniverDay){
        this.anniverDay = anniverDay;
        return this;
    }

    public ContactData withAnniverMonth(String anniverMonth){
        this.anniverMonth = anniverMonth;
        return this;
    }

    public ContactData withAnniverYear(String anniverYear){
        this.anniverYear = anniverMonth;
        return this;
    }

    public ContactData withGroupName(String groupName){
        this.groupName = groupName;
        return this;
    }

    public ContactData withSecondAddress(String secondAddress){
        this.secondAddress = secondAddress;
        return this;
    }

    public ContactData withSecondHomePhoneNumber(String secondHomePhoneNumber){
        this.secondHomePhoneNumber = secondHomePhoneNumber;
        return this;
    }

    public ContactData withNotes(String notes){
        this.notes = notes;
        return this;
    }

    public ContactData withAllPhones(String allPhones) {
        this.allPhones = allPhones;
        return this;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (id != that.id) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
