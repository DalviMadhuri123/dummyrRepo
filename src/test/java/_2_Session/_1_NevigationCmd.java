package _2_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_NevigationCmd {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver", "C:\\Users\\madhu\\eclipse-workspace\\Batch18WebDriver\\chromedriver.exe");
	 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
	System.out.println("Title of google page is  -> "  + driver.getTitle());
	
     Thread.sleep(2000);
     
	
	driver.navigate().to("https://www.facebook.com/");
	
	System.out.println("Title og google page is  -> "  + driver.getTitle());
		
	 Thread.sleep(2000);
	 
	 driver.navigate().back();
	 System.out.println("Title of google page after getting back from facebook  -> "  + driver.getTitle());
	 
	 Thread.sleep(2000);
	 
	 driver.navigate().forward();
	 System.out.println("Title of facebook page after getting forward from google  -> "  + driver.getTitle());
	 Thread.sleep(2000);
	 
	 driver.navigate().refresh();
	 System.out.println("Title of facebook page after getting forward from google  -> "  + driver.getTitle());
	 
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.get("https://www.google.com/");
		
		//String expTitle = "Google";
		//String actTitle = driver.getTitle();
		
		//if (expTitle.equals(actTitle))
		//{
			
			//System.out.println("Test is pass");
		//}
		//else
		//{
			//System.out.println("Test is Fail");
			
		//}
	
			
		driver.quit();
		
		
		
		
	}

}
