package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;

 public  LoginPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 
	 
 }
	 @FindBy(xpath="//*[@name='username']")
	 WebElement userid;
	 
	 @FindBy(xpath="//*[@name='password']")
	 WebElement pwd;
	 
	 
	 @FindBy(xpath="//*[@type='submit']")
	 WebElement Click;
	 
	 @FindBy(xpath=("//*[text()='Dashboard']"))
	 WebElement heading;
	 
	 public void setUser(String user) {
		 
		 userid.sendKeys(user);
	 }
	 
	 public void setPassword(String pass) {
		 
		 pwd.sendKeys(pass);
	 }
	 
	 public void Submit() {
		Click.click();
	 }
	 public boolean textDisplay() {
		return heading.isDisplayed();

	 }
 }