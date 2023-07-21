package Advith;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic_Login {
	
	static WebDriver driver;
  @Test
  public void OrangeHRM() throws Exception 
  
  {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  
	
	findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
    findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	findElement(By.xpath("//input[@class='button']")).click();
	
	
  }
	public static  WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}

  
}

