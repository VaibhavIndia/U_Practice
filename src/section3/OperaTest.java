package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.opera.driver", "C:\\Selenium\\Browsers\\opera\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
