package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.AutomationPage;
import pages.LoginPage;
import pages.HomePage;
import pages.SubscribersPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
     LoginPage loginPage;
     HomePage homePage;
     SubscribersPage subscribersPage;
     AutomationPage automationPage;

    @BeforeClass
    public void setUp() {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Initialize Page Objects
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        subscribersPage = new SubscribersPage(driver);
        automationPage = new AutomationPage(driver);



        // Set up WebDriver configuration
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Open the home page
        driver.navigate().to("https://dashboard.mailerlite.com/");
    }

    @AfterMethod
    public void tearDown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
