package section10;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture75
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		
		// to check in a particular section 
		WebElement wd2 = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]"));
		int i = wd2.findElements(By.tagName("a")).size();
		System.out.println(i);
		
		
		// to check 
		for (int j= 0; j<i ;j++)
		{ 
			/*String s = wd2.findElements(By.tagName("a")).get(j).getAttribute("href");
			System.out.println(s);
			*/
			if (wd2.findElements(By.tagName("a")).get(j).getText().contains("Site"))
			{
				System.out.println(driver.getTitle());
				wd2.findElements(By.tagName("a")).get(j).click();
				System.out.println(driver.getTitle());
				break;
			}
		}
	}

}
