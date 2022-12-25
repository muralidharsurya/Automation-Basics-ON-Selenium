package automationBaasics1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchingBrowser {
	public static void main(String[] args) throws Exception{
		 System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
	}

}
