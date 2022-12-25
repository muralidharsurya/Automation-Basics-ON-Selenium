package writing_script_basics;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Set;

import javax.print.attribute.SetOfIntegerSyntax;

import org.checkerframework.framework.qual.JavaExpression;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_login {
	public static void main(String[] args) throws Exception {
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("[class='_2IX_2- VJZDxU']")).sendKeys("7981425792");
		  driver.findElement(By.cssSelector("[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Surya123");
		  driver.findElement(By.cssSelector("[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		  driver.findElement(By.cssSelector("[class='_3704LK']")).sendKeys("iphone");
		  WebElement element = driver.findElement(By.cssSelector("[type='submit']"));
		  element.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  driver.findElement(By.xpath("(//div[@class='_36fx1h _6t1WkM _3HqJxg']/div/div[2]/div[2]/div/div/div/a/div[2]/div/div)[1]")).click();
	  String str =driver.getWindowHandle();
		 Set<String> strg = driver.getWindowHandles();
		 for(String a:strg) {
			 if(!a.equals(str)) {
				  driver.switchTo().window(a); 	 } }
		 
		 
		 Actions actons= new Actions(driver);
		//WebElement element1 =  driver.findElement(By.xpath("(//img[@class='q6DClP'])[1]"));
		
		 actons .moveToElement(driver.findElement(By.xpath("(//img[@class='q6DClP'])[1]"))).perform();
		 actons	 .moveToElement(driver.findElement(By.xpath("(//img[@class='q6DClP'])[2]"))).perform();
		 actons	 .moveToElement(driver.findElement(By.xpath("(//img[@class='q6DClP'])[3]"))).perform();
		 actons .moveToElement(driver.findElement(By.xpath("(//img[@class='q6DClP'])[4]"))).perform();
		 actons .moveToElement(driver.findElement(By.xpath("(//img[@class='q6DClP'])[5]"))).perform();
		 actons .moveToElement(driver.findElement(By.xpath("(//img[@class='q6DClP'])[6]"))).perform();
		 actons .moveToElement(driver.findElement(By.xpath("(//img[@class='q6DClP'])[7]"))).perform();
	
		 
	driver.findElement(By.cssSelector("[class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
