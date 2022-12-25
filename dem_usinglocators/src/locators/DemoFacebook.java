package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacebook {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//cssSelector tag and id
		//driver.findElement(By.cssSelector("input#email")).sendKeys("smuralidhar6@gmail.com");
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("$9492453960");
	//	driver.findElement(By.cssSelector("button[name='login']")).click();
		
		//Tag and class (tag.class) or (.class)
		
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("smuralidhar6@gmail.com");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("smuralidhar6@gmail.com");
		
		// Tag annd Attribute (tag[attribute='value']
		
	//	driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("smuralidhar6@gmail.com");
	//driver.findElement(By.cssSelector("[data-testid='royal_email']")).sendKeys("smuralidhar6@gmail.com");
		
		//Tag,class&attribute
		
		driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_email']")).sendKeys("smuralidhar6@gmail.com");
	}

}
