package _19_Session;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _dragnDrop {
	
	WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
	}

	@Test
	public void dragNDrop() throws InterruptedException
	{
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	
	
	WebElement element1 = driver.findElement(By.id("draggable"));
	
	WebElement dropArea = driver.findElement(By.id("droppable"));
	
	
	Actions act = new Actions(driver);
	
	
	Thread.sleep(5000);
	
	act.dragAndDrop(element1, dropArea).build().perform();	
	
	Thread.sleep(3000);
	
	
	WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']/p"));
	String dropText = dropElement.getText();
	
		if(dropText.equals("Dropped!"))
		{
			System.out.println("Test is pass");
		}
		
		else
			
		{
			System.out.println("Test is Fail");
			
		}
		}
	

	@After
	
	public void teardown() throws InterruptedException
	
	{
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
