import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators_and_actions 
{
	public static void main(String[] args) 
	{

		 System.setProperty("webdriver.chrome.driver",("C://Java-Projects-2019/drivers/chromedriver-v2.45.exe"));
		 ChromeDriver driver = new ChromeDriver();
		/*
		 System.setProperty("webdriver.gecko.driver",("C://Java-Projects-2019/drivers/geckodriver-v0.23.exe"));
		 FirefoxDriver driver = new FirefoxDriver();
		 */
		 driver.get("https://cnn.com");
		 System.out.println(driver.getTitle());
		
		 driver.get("https://bbc.com");
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().back();
		 
		 if
		 (driver.getTitle().contains("CNN"))
		 System.out.println("Back on CNN");
		 else
			System.out.println("Still on BBC");
		
		 driver.quit();
	}

}