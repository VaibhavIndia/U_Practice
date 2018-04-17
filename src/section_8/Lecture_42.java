package section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_42 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		/*
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='IXJ'])[2]")).click();
		*/
		boolean prev,now;
		prev = driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected();
		System.out.println(prev);
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		now = driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected();
		System.out.println(now);
	}

}
