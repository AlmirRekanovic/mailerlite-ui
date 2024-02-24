package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // XPath's expressions for elements on the Contact Us page
    private static final By EMAIL_INPUT = By.id("email");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void populateEmail(String email) {
        // Populate email field
        driver.findElement(EMAIL_INPUT).sendKeys(email);
    }

    public void populatePassword(String password) {
        // Populate password field
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void login(String email, String password) {
        // Login to the site
        populateEmail(email);
        populatePassword(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

}
