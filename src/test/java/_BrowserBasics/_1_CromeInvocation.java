package _BrowserBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_CromeInvocation {
	
	public static void main(String[] args) {
		
		
		//Download a Browser Driver
		//Set the path of Browser diver
		//Start writing the code using selenium method using java
		
		//System.setProperty("webdriver.crome.driver", "C:\\Users\\madhu\\eclipse-workspace\\Batch18WebDriver\\chromedriver.exe");
		//System.setProperty("webdriver.crome.driver", "cromedriver.exe");
		System.setProperty("webdriver.crome.driver", System.getProperty("user.dir")  + "/cromedriver.exe");
	
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		
		
		String expTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actTitle = driver.getTitle();
		System.out.println("Actual Title form application  " + actTitle);
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("Title Validation is pass");
		
		}
		else
		{
			System.out.println("Title validation is failed");
			System.out.println("Expected Title is "  + expTitle);
			System.out.println("Actual Title is"  + actTitle);
		}
		driver.quit();
		
		
		
		
	}

}
