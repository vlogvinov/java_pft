package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ContactCreationTests {
    FirefoxDriver browser;
    
    @BeforeMethod
    public void setUp() throws Exception {
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openHomePage();
        login("admin", "secret");
    }

    @Test
    public void ContactCreationTests() {
        initContactCreation();
        fillContactForm("Vladimir", "Vitalievich", "Logvinov", "vlogvinov", "Mr.", "P4", "Zakrevskogo street 67", "5469878", "0639876756", "0994565678", "Fax", "volodymyr.logvinov@gmail.com", "my_second_email@gmail.com", "my_thirdemail@gmail.com", "myhomepage.com", "4", "4", "1993", "3", "2", "2003",
                "Dmitria Lucenka 13", "5679867", "My super notes");
        submitContactCreation();
        returnToHomePage();
    }

    @AfterMethod
    public void tearDown() {
        browser.quit();
    }

    private void openHomePage() {
        browser.get("http://addressbook/");
    }

    private void login(String username, String password) {
        browser.findElement(By.name("user")).click();
        browser.findElement(By.name("user")).clear();
        browser.findElement(By.name("user")).sendKeys(username);
        browser.findElement(By.name("pass")).click();
        browser.findElement(By.name("pass")).clear();
        browser.findElement(By.name("pass")).sendKeys(password);
        browser.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    private void initContactCreation() {
        browser.findElement(By.linkText("add new")).click();
    }

    private void fillContactForm(String firstName, String middleName, String lastName, String nickName, String title, String company, String firstAddress, String homePhoneNumber, String mobilePhoneNumber,
                                 String workPhoneNumber, String fax, String mainEmail, String secondEmail, String thirdEmail, String homePage, String birthDay, String birthMonth, String birthYear,
                                 String anniverDay, String anniverMonth, String anniverYear, String secondAddress, String secondHomePhoneNumber, String notes) {
        browser.findElement(By.name("firstname")).click();
        browser.findElement(By.name("firstname")).clear();
        browser.findElement(By.name("firstname")).sendKeys(firstName);
        browser.findElement(By.name("middlename")).click();
        browser.findElement(By.name("middlename")).clear();
        browser.findElement(By.name("middlename")).sendKeys(middleName);
        browser.findElement(By.name("theform")).click();
        browser.findElement(By.name("lastname")).click();
        browser.findElement(By.name("lastname")).clear();
        browser.findElement(By.name("lastname")).sendKeys(lastName);
        browser.findElement(By.name("nickname")).click();
        browser.findElement(By.name("nickname")).clear();
        browser.findElement(By.name("nickname")).sendKeys(nickName);
        /* photo field */
        browser.findElement(By.name("title")).click();
        browser.findElement(By.name("title")).clear();
        browser.findElement(By.name("title")).sendKeys(title);
        browser.findElement(By.name("company")).click();
        browser.findElement(By.name("company")).clear();
        browser.findElement(By.name("company")).sendKeys(company);
        browser.findElement(By.name("address")).click();
        browser.findElement(By.name("address")).clear();
        browser.findElement(By.name("address")).sendKeys(firstAddress);
        browser.findElement(By.name("home")).click();
        browser.findElement(By.name("home")).clear();
        browser.findElement(By.name("home")).sendKeys(homePhoneNumber);
        browser.findElement(By.name("mobile")).click();
        browser.findElement(By.name("mobile")).clear();
        browser.findElement(By.name("mobile")).sendKeys(mobilePhoneNumber);
        browser.findElement(By.name("work")).click();
        browser.findElement(By.name("work")).clear();
        browser.findElement(By.name("work")).sendKeys(workPhoneNumber);
        browser.findElement(By.name("fax")).click();
        browser.findElement(By.name("fax")).clear();
        browser.findElement(By.name("fax")).sendKeys(fax);
        browser.findElement(By.name("email")).click();
        browser.findElement(By.name("email")).clear();
        browser.findElement(By.name("email")).sendKeys(mainEmail);
        browser.findElement(By.name("email2")).click();
        browser.findElement(By.name("email2")).clear();
        browser.findElement(By.name("email2")).sendKeys(secondEmail);
        browser.findElement(By.name("email3")).click();
        browser.findElement(By.name("email3")).clear();
        browser.findElement(By.name("email3")).sendKeys(thirdEmail);
        browser.findElement(By.name("homepage")).click();
        browser.findElement(By.name("homepage")).clear();
        browser.findElement(By.name("homepage")).sendKeys(homePage);

        // Birth date
        if (!browser.findElement(By.xpath("//div[@id='content']/form/select[1]//option[" + birthDay + "]")).isSelected()) {
            browser.findElement(By.xpath("//div[@id='content']/form/select[1]//option[" + birthDay + "]")).click();
        }
        if (!browser.findElement(By.xpath("//div[@id='content']/form/select[2]//option[" + birthMonth + "]")).isSelected()) {
            browser.findElement(By.xpath("//div[@id='content']/form/select[2]//option[" + birthMonth + "]")).click();
        }
        browser.findElement(By.name("byear")).click();
        browser.findElement(By.name("byear")).clear();
        browser.findElement(By.name("byear")).sendKeys(birthYear);

        // Anniversary date
        if (!browser.findElement(By.xpath("//div[@id='content']/form/select[3]//option[" + anniverDay + "]")).isSelected()) {
            browser.findElement(By.xpath("//div[@id='content']/form/select[3]//option[" + anniverDay + "]")).click();
        }
        if (!browser.findElement(By.xpath("//div[@id='content']/form/select[4]//option[" + anniverMonth + "]")).isSelected()) {
            browser.findElement(By.xpath("//div[@id='content']/form/select[4]//option[" + anniverMonth + "]")).click();
        }
        browser.findElement(By.name("ayear")).click();
        browser.findElement(By.name("ayear")).clear();
        browser.findElement(By.name("ayear")).sendKeys(anniverYear);

        /*  group  selector */

        browser.findElement(By.name("address2")).click();
        browser.findElement(By.name("address2")).clear();
        browser.findElement(By.name("address2")).sendKeys(secondAddress);
        browser.findElement(By.name("phone2")).click();
        browser.findElement(By.name("phone2")).clear();
        browser.findElement(By.name("phone2")).sendKeys(secondHomePhoneNumber);
        browser.findElement(By.name("notes")).click();
        browser.findElement(By.name("notes")).clear();
        browser.findElement(By.name("notes")).sendKeys(notes);
    }

    private void submitContactCreation() {
        browser.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    private void returnToHomePage() {
        browser.findElement(By.linkText("home page")).click();
    }
}
