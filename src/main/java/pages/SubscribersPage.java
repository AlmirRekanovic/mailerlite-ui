package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SubscribersPage extends BasePage{
    public SubscribersPage(WebDriver driver) {
        super(driver);
    }

    // XPath's expressions for elements on the Contact Us page

    private static final By GROUP_SECTION = By.xpath("//a//span[text()='Groups']");
    private static final By WARNING_POPUP = By.xpath("//h2[contains(text(), 'Are you sure you want to delete')]");
    private static final By DELETE_OPTION = By.xpath("//span[contains(text(), 'Delete')]");
    private static final By SELECT_ALL_OPTION = By.xpath("//label[text()=' Select all ']");

    public void navigateToGroupsSection() {
        driver.findElement(GROUP_SECTION).click();
    }

    public void deleteGroup() {
        // Click on select all and delete button
        driver.findElement(SELECT_ALL_OPTION).click();
        driver.findElement(DELETE_OPTION).click();
    }

    public void verifyThatWarningPopupIsDisplayed() {
        //Expected text in the warning popup
        String  warningText = driver.findElement(By.xpath("//div[contains(text(), 'There are')]")).getText().trim();

        // Verify that popup is displayed when you try to delete the group which is associated with triggers
        Assert.assertTrue(driver.findElement(WARNING_POPUP).isDisplayed());
        Assert.assertEquals(warningText,"There are automations using the selected groups, which will be automatically disabled if you choose to proceed.","Warning message is incorrect");
    }
}
