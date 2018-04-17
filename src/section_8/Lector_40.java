package section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Selecting Static Dropdown
 */
public class Lector_40 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Select s = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']")));
		s.selectByValue("2");
		s.selectByIndex(3);
		s.selectByVisibleText("4");
		
		
	}

}
