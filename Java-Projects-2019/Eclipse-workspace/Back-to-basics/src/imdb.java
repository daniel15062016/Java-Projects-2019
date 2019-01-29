import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imdb 
{

	public static void main(String[] args) 
	{

		 System.setProperty("webdriver.chrome.driver",("C://Java-Projects-2019/drivers/chromedriver-v2.45.exe"));
		 ChromeDriver driver = new ChromeDriver();
		/*
		 System.setProperty("webdriver.gecko.driver",("C://Java-Projects-2019/drivers/geckodriver-v0.23.exe"));
		 FirefoxDriver driver = new FirefoxDriver();
		 */
		 driver.get("https://www.imdb.com/");
		 System.out.println(driver.getTitle());
		
		 
		 boolean menu_drop = driver.findElement(By.cssSelector("#navTitleMenu")).isDisplayed();
		
		 if (menu_drop = true)
			System.out.println(menu_drop);
		 	driver.findElement(By.linkText("Top Rated Movies")).click(); 
		 	System.out.println(driver.getTitle());
		 	
		/* 	
		 String columnIndex = driver.findElement(By.className("titleColumn")).getText();
		 */
		 driver.quit();

	}

}
