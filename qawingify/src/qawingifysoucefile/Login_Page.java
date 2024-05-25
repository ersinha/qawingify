package qawingifysoucefile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page 
{
	WebDriver driver;
	//Locating element for each component
	@FindBy(id="username")
	WebElement usernameField;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(id="log-in")
	WebElement lgoinButton;
	
	//Passing data in element for each component
	public void username()
	{
		usernameField.sendKeys("abc");
	}
	public void password() 
	{
		passwordField.sendKeys("abc");
	}
	public void button() 
	{
		lgoinButton.click();
	}
	
	//Creating Constructor and Initializing the elements using PageFactory Class inside it.
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
