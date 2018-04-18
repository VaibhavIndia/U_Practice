package section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_45 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		//select milk
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(count);
		
		// Click on all radio buttons 
		
		for (int i = 0; i<count ; i++)
		{
			System.out.println("selecting all radios");
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		
		// Select the Button which have cheese text present
		for (int i = 0; i<count ; i++)
		{
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text.equalsIgnoreCase("cheese"))
			{
				System.out.println("Selcting cheese");
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
	}

}
