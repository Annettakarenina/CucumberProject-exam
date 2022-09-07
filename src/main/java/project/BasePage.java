package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public static WebDriver driver;
	public void initDriver() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_105(1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	}
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
