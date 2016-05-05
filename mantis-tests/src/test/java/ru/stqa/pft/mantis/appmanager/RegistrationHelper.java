package ru.stqa.pft.mantis.appmanager;


import org.openqa.selenium.WebDriver;

public class RegistrationHelper {
    private final ApplicationManager app;
    private final WebDriver driver;

    public RegistrationHelper(ApplicationManager app) {
        this.app = app;
        driver = app.getDriver();
    }

    public void start(String username, String email) {
        driver.get(app.getProperty("web.baseUrl") + "/signup_page.php");
    }
}
