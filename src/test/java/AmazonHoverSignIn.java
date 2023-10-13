import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverSignIn 
{
	private WebDriver driver;
	
	public void testAmazon() 
	{
		driver = new ChromeDriver();		
		driver.get("https://www.amazon.com");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.manage().window().maximize();				
										
		WebElement signInBox = driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(signInBox).perform();		
		//Thread.sleep(3000);		
		System.out.println("Mouse hOver the SignIn Box");
	
		WebElement loginBtn= driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a/span"));
		loginBtn.click();
		//Thread.sleep(3000);
		System.out.println("Clicked the Sign-In Button");
		
		driver.quit();
	}

}
