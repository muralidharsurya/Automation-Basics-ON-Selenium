package custamiseLoginofActiTime;

public class Execution_class {
	public static void main(String[] args) throws Throwable {
		Actitime_excution ae = new Actitime_excution();
		ae.launchBrowser();
		Thread.sleep(2000);
		ae.login();
		Thread.sleep(2000);
		ae.excution();
		Thread.sleep(2000);
		ae.logout();
		Thread.sleep(2000);
		ae.closeBrowser();
	}

}
