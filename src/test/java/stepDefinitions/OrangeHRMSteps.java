package stepDefinitions;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {

    WebDriver driver;

    @Given("I launch Chrome browser")
    public void i_launch_Chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tudor\\IdeaProjects\\SeleniumCucumber\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver(); // Launch Chrome browser
    }

    @When("I open OrangeHRM homepage")
    public void i_open_OrangeHRM_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("I verify that the logo is present on page")
    public void i_verify_that_the_logo_is_present_on_page() {
        boolean status = driver.findElement(By.xpath("//*[@id='divLogo']/img")).isDisplayed();
        Assert.assertTrue(status);
//        Thread.sleep(5000);
    }

    @And("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}
