package automationBaasics1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Programm9 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",  "E:\\\\Drivers\\\\chromedriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
	}

}

