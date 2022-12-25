package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActitime {
	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(4000);
	 String title = driver.getTitle();
	 System.out.println("Tile is :"+title);
 if (title.contains("actiTIME"))
System.out.println("pass");
 else
	 System.out.println("fail");
  driver.close();
  
		
		
	}

}
