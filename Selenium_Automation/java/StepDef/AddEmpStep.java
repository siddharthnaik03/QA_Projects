package StepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObject.AddEmp;
import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class AddEmpStep {
 WebDriver driver;
 LoginPage lp;
 AddEmp ae;
 
 @Given("User is logged into OrangeHRM")
 public void user_in_Browser() {
	 driver = new org.openqa.selenium.chrome.ChromeDriver();
     driver.manage().window().maximize();

     driver.get("https://opensource-demo.orangehrmlive.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

     lp = new LoginPage(driver);
     lp.setUser("Admin");
     lp.setPassword("admin123");
     lp.Submit();

     ae = new AddEmp(driver);
	 
 }
 @When("User navigates to PIM module")
 public void go_to_Pim() {
	 ae.openPIM();
	 
 }
 @And("User clicks Add Employee")
 public void add_emp_button(){
	 ae.addbutton();
 }
 @And("User enters employee details")
 public void add_details() {
	 ae.addDetails();
 }
 @And("User clicks Save button")
 public void submit_details() {
	 ae.saveButton();
 }
 @Then("Employee should be added successfully")
 public void dispalyed() {
	Assert.assertTrue( ae.IsAdeed());
	driver.quit();
 }
}
