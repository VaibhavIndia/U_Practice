package section3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Answer 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/12562597/two-conditions-using-or-in-xpath?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa");
		System.out.println(driver.findElements(By.xpath("//div[@itemtype='http://schema.org/Answer']")).size());
	}

}
