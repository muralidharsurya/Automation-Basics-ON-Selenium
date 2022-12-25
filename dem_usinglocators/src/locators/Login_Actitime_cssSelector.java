package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Actitime_cssSelector {
	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("[placeholder='Password']")). sendKeys("manager");
	driver.findElement(By.cssSelector("[id='loginButton']")).click();
	
		
	}

}
