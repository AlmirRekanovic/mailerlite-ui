package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToSection(String section) {
        driver.findElement(By.xpath("//div[@data-test-id='sidebar-navigation']//span[text()='"+section+"']")).click();
    }

    public void acceptCookies(){
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
    }
}
