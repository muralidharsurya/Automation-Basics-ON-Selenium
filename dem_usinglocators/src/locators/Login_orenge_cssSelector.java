	package locators;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Login_orenge_cssSelector {
		public static void main(String[] args) throws Exception {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
		Thread.sleep(2000);
			driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
			driver.findElement(By.cssSelector("[type='password']")).sendKeys("admin123");
			driver.findElement(By.cssSelector("[type='submit']")).click();
			
		}
	
	}
