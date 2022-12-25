package automationBaasics1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Lunchingfirfox {
	public static void main(String[] args) {
	//	System.setProperty("weddriver.gecko.driver", "E:\\Drivers\\geckodrivwer\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
	}

}
