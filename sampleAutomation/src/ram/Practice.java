package ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
		public static void main(String  []args ){
		//	System.setProperty("webdriver.driver.chrome", "A:\\Selenium\\JarFile\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
			//Thread.sleep(2000);
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
			WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
			
		if(fname.isDisplayed()&&lname.isEnabled())
			{
			fname.sendKeys("Bhaubali");	
			}
		if(lname.isDisplayed()&&lname.isEnabled())
			{
			lname.sendKeys("Prabhas");
			}
		System.out.println(driver.findElement(By.xpath("//input[@id='u_0_5_3b']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='u_0_4_2G']")).isSelected());
		}	
	}



