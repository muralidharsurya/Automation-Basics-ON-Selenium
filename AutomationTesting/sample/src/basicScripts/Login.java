package basicScripts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://login.salesforce.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("smuralidhar6-yqgz@force.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@Muralidhar8");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[contains(@class,'slds-icon slds-icon-text-default sl')])[2]")).click();

		driver.findElement(By.xpath("//*[@class='slds-dropdown__item']")).click();
		//driver.findElement(By.xpath("(//input[@class='slds-input'])[1]")).click();
		/*
		 * driver.findElement(By.xpath("//input[@id='input-178']")).sendKeys("Murali");
		 * driver.findElement(By.xpath("(//li[@class='slds-listbox__item'])[2]")).click(
		 * );
		 * 
		 * driver.findElement(By.xpath("//input[@id='input-183']")).sendKeys(
		 * "9875623539");
		 * driver.findElement(By.xpath("//*[@id='combobox-button-191-5-191']")).click();
		 * List<WebElement> select =
		 * driver.findElements(By.xpath("[id='combobox-button-199']")); int []select1=
		 * new int[select.size()]; for(int i=0;i<=select.size();i++) { WebElement
		 * d=select.get(5); d.submit(); }
		 * 
		 * driver.findElement(By.xpath("")).sendKeys("");
		 * driver.findElement(By.xpath("")).sendKeys("");
		 * driver.findElement(By.xpath("")).sendKeys("");
		 * driver.findElement(By.xpath("")).sendKeys("");
		 * driver.findElement(By.xpath("")).sendKeys("");
		 * driver.findElement(By.xpath("")).sendKeys("");
		 */

	}

}
