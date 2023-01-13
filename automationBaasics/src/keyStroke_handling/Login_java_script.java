package keyStroke_handling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Login_java_script {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 JavascriptExecutor  jse = (JavascriptExecutor)driver;
		 jse.executeScript("document.getElementById(\"username\").value=\"admin\";");
		 jse.executeScript("document.getElementsByName(\"pwd\").value=\"manager\";");
		 jse.executeScript("document.getElementById(\"loginButton\").click();");
		 
	 driver.close();
	}

}
