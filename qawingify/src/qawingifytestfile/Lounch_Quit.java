package qawingifytestfile;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Lounch_Quit 
{
	ChromeDriver driver;
	@BeforeMethod
	void Lounch()
	{
		driver=new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
		
	@AfterMethod
	void quit() throws InterruptedException
	{
	Thread.sleep(2000);
	driver.quit();
		
	}
}
