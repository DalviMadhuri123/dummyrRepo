package _BrowserBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _2_EdgeInvocation {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\madhu\\eclipse-workspace\\Batch18WebDriver\\msedgedriver.exe");
	
       WebDriver driver = new EdgeDriver();
       
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
