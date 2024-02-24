package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPage extends BasePage{
    public AutomationPage(WebDriver driver) {
        super(driver);
    }

    // XPath's expressions for elements on the Contact Us page
    private static final By NEW_AUTOMATION_BUTTON = By.xpath("//span[contains(text(),'New')]");
    private static final By CREATE_BUTTON = By.xpath("//span[text()='Create']");
    private static final By NAME_FIELD = By.id("name");
    private static final By START_BUILDING = By.xpath("//button[@type='submit']");

    private static final By ITEM_DROPDOWN = By.xpath("//div[@data-test-id='dropdown-button']");

    private static final By SUBSCRIBER_JOIN_OPTION = By.xpath("//span[text()='Workflow triggered when a subscriber joins your subscriber group(s)']");

    private static final By ADD_GROUP_CHECKBOX = By.xpath("//input[@id='group-checkbox-undefined']/parent::label");

    private static final By SAVE_CLOSE_BUTTON = By.xpath("//span[text()='Save and close']");
    private static final By SUBSCRIBER_NAME_FIELD = By.xpath("//input[@type='text']");
    private static final By ADD_MORE_STEPS = By.xpath("//button[@data-toggle='popover']");
    private static final By ACTION_BUTTON = By.xpath("//span[text()='Action']");
    private static final By COPY_SELECTION = By.xpath("//span[text()=' Copy to group(s) ']");
    private static final By SAVE_BUTTON = By.xpath("//button[@type='submit']");
    public void createAutomationWithSubGroup(String automationName, String groupName) throws InterruptedException {
        driver.findElement(NEW_AUTOMATION_BUTTON).click();
        driver.findElement(CREATE_BUTTON).click();
        driver.findElement(NAME_FIELD).sendKeys(automationName);
        driver.findElement(START_BUILDING).click();
        Thread.sleep(1000); // Sleep for 5 seconds (5000 milliseconds)
        driver.findElement(ITEM_DROPDOWN).click();
        driver.findElement(SUBSCRIBER_JOIN_OPTION).click();
        driver.findElement(SUBSCRIBER_NAME_FIELD).sendKeys(groupName);
        Thread.sleep(1000); // Sleep for 5 seconds (5000 milliseconds)
        driver.findElement(ADD_GROUP_CHECKBOX).click();
        Thread.sleep(1000); // Sleep for 5 seconds (5000 milliseconds)
        driver.findElement(SAVE_BUTTON).click();
        driver.findElement(ADD_MORE_STEPS).click();
        driver.findElement(ACTION_BUTTON).click();
        driver.findElement(ITEM_DROPDOWN).click();
        driver.findElement(COPY_SELECTION).click();
        driver.findElement(SAVE_BUTTON).click();
        driver.findElement(SAVE_CLOSE_BUTTON).click();
    }

}
