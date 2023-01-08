package custamiseLoginofActiTime;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_excution {

	WebDriver driver;
public void launchBrowser() {
	 System.setProperty("webdriver.chrome.driver", "E:\\\\Drivers\\\\chromedriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");	
}
public void login() throws Throwable {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(2000);
	
}
public void excution() throws InterruptedException {
	
	Random r=new Random();
	int goals= r.nextInt();
	driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@class,'item create')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[contains(@class,'inputFieldWithPlaceholder n')]")).sendKeys("Suryaraju"+goals);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("automationengg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	Thread.sleep(2000);
	String actualName=driver.findElement(By.xpath("(//div[@class='title'])[27]")).getText();
	
	System.out.println(actualName);
}
public void logout() {
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
}
public void closeBrowser() {
	driver.quit();
	
}
	
}
