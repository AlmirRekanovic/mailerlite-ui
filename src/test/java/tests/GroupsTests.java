package tests;

import data.GroupsData;
import org.testng.annotations.Test;

import java.util.UUID;


public class GroupsTests extends BaseTest {
    UUID random = UUID.randomUUID();

    GroupsData groupsData = GroupsData.builder()
            .automationName(random.toString().substring(0, 4))
            .groupName(random.toString().substring(0, 4))
            .build();

    @Test(priority = 1)
    public void testVerifyGroupWarningPopUpIsDisplayed() throws InterruptedException {

        // Login to the page
        //TODO If you are logging first time please
        // first login manually on your computer
        // so you don't need verification code
        loginPage.login("almir.rekanovic1996@gmail.com", "19Rek@96");

        // Navigate to automation page
        homePage.navigateToSection("Automation");
        homePage.acceptCookies();

        // Create trigger with subgroup
        automationPage.createAutomationWithSubGroup(groupsData.getAutomationName(), groupsData.getGroupName());

        // Navigate to subscribers page
        homePage.navigateToSection("Subscribers");

        // Navigate to groups and delete it
        subscribersPage.navigateToGroupsSection();
        subscribersPage.deleteGroup();
        subscribersPage.verifyThatWarningPopupIsDisplayed();


    }

    @Test(priority = 2)
    public void verifyThatUserCanCancelChanges() {
    }

    @Test(priority = 3)
    public void verifyThatPopupWillShowIfThereAreMultipleGroups() {
    }

    // And more tests
}
