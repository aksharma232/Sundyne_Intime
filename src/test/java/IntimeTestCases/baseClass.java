package IntimeTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseClass {
	public WebDriver d;

	@BeforeMethod

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		//op.addArguments("headless");
		d = new ChromeDriver(op);
		d.get("http://192.168.1.100:8081/");
		// LoginPage lp = new LoginPage(d);

	}

	@AfterMethod
	public void closeBrowser() {
		d.close();
	}

}
