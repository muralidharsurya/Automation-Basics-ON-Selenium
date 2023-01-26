package prepairedataDrivenFramWork;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile_Connection {
	
		public static void main(String[] args) throws Exception {
			FileInputStream fis = new FileInputStream("E:\\New folder\\Actitime.properties");
			    
			Properties ps = new Properties();
			ps.load(fis);
			 String usrname = ps.getProperty("usernmae");
			 String pass = ps.getProperty("password");
			 String browser=ps.getProperty("browser");
			 String URL = ps.getProperty("url");
			System.out.println(usrname+" "+pass+" "+browser+" "+URL);
			 
			 WebDriver driver = new ChromeDriver();
			 
			 driver.get(URL);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.manage().window().maximize();
			 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(usrname);
			 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
			 driver.findElement(By.xpath("//div[text()='Login ']")).click();
			 
			
			
			
		}
		}


