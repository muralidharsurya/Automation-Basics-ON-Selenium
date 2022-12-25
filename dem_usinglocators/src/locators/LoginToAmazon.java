package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToAmazon {
public static void main(String[] args) throws Exception {

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/s?i=merchant-items&me=A2278M982WV2RE");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement searchbox =driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("MI");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	// Tagname
	
	int  links=driver.findElements(By.tagName("a")).size();
	System.out.println(links);
	
	
}
}
