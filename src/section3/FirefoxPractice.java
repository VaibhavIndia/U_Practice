package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxPractice
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Go to url
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
