package qawingifytestfile;

import org.testng.annotations.Test;

import qawingifysoucefile.Home_Page;
import qawingifysoucefile.Login_Page;

public class Senario_1 extends Lounch_Quit
{
	
	@Test
	public void end_to_end() 
	{
		//Creating Object of login page
		Login_Page lgpg = new Login_Page(driver);
		lgpg.username();
		lgpg.password();
		lgpg.button();
		
		//Creating Object of login page
		Home_Page hmpg = new Home_Page(driver);
		hmpg.amount_header_before_click();
		hmpg.amount_header_after_click();
		
	}

}
