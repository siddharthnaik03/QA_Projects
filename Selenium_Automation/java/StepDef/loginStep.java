package StepDef;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;


public class loginStep {

    WebDriver driver;
    LoginPage lp;

    @Given("User launches the browser")
    public void user_launches_browser()  {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	lp = new LoginPage(driver); 
    }

    @When("User opens OrangeHRM login page")
    public void open_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @And("User enters username and password")
    public void enter_credentials() {
    	
        lp.setUser("Admin");
        lp.setPassword("admin123");
    }

    @And("Clicks on login button")
    public void click_login() {
        lp.Submit();
    }

    @Then("User should navigate to dashboard")
    public void verify_dashboard() {

        Assert.assertTrue(lp.textDisplay());
        driver.quit();
    }
}
