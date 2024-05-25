package qawingifysoucefile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Home_Page 
{
	WebDriver driver;
	//Locating element for each component
	@FindBy(id="amount")
	WebElement amountheader;
	
	@FindBy (xpath="//table[@id='transactionsTable']")
	WebElement table;
	
	@FindBy (xpath="//table[@id='transactionsTable']/tbody/tr/td[5]")
	List <WebElement> amounttable;
	

	//Passing data in element for each component
	public void amount_header_after_click()
	{
		amountheader.click();
		int ordervise = amounttable.size();
		String afterSort []= new String[amounttable.size()];
		System.out.println("-----------After click on Account-----------");
		for (int i=0; i<ordervise; i++) 
		{
			afterSort[i] =amounttable.get(i).getText();
			System.out.println(afterSort[i]);
		}
		
	}
	public void amount_header_before_click()
	{
		int ordervise = amounttable.size();
		String beforeSort []= new String[amounttable.size()];
		System.out.println("-----------Before click on Account-----------");
		for (int i=0; i<ordervise; i++) 
		{
			beforeSort[i] =amounttable.get(i).getText();
			System.out.println(beforeSort[i]);
		}
	}
	public void assert_use() 
	{
		//Assert.assertEquals(afterSort[i] , beforeSort[i]);
	}
	
	
	
	//Creating Constructor and Initializing the elements using PageFactory Class inside it.
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
