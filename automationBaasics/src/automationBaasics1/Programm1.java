package automationBaasics1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Programm1 {
	public static void main(String[] args) {
		 System.setProperty("wedriver.chrome.driver", "E:\\\\Drivers\\\\chromedriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  
		  String url = driver.getCurrentUrl();
		  System.out.println(url);
		  
		   String srcCode = driver.getPageSource();
	    System.out.println("source code :"+ srcCode);	   

	    
	}

}
