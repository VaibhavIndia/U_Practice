package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerPractice
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Browsers\\ie\\InternetExplorerDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
