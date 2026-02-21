package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmp {
WebDriver driver;

public AddEmp(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath=("//*[text()='PIM']"))
WebElement PIMButton;

@FindBy(xpath="//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")
WebElement addbtn;

@FindBy(xpath="//*[@placeholder='First Name']")
WebElement firstname;

@FindBy(xpath="//*[@placeholder='Last Name']")
WebElement lastname;

@FindBy(xpath="//*[@class='oxd-input oxd-input--active']")
WebElement empid;

@FindBy(xpath="//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
WebElement save;

@FindBy(xpath="//*[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
WebElement perDetails;



public void openPIM() {
	PIMButton.click();
}
public void addbutton() {
	addbtn.click();
}

public void addDetails() {
	firstname.sendKeys("alex");
	lastname.sendKeys("cook");
	empid.sendKeys("9898");
}
public void saveButton() {
	save.click();
}
public boolean IsAdeed() {
	return perDetails.isDisplayed();
}
}
