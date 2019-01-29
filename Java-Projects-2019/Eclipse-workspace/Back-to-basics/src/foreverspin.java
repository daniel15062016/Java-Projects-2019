import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class foreverspin 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver",("C://Java-Projects-2019/drivers/chromedriver-v2.45.exe"));
		 ChromeDriver driver = new ChromeDriver();
		/*
		 System.setProperty("webdriver.gecko.driver",("C://Java-Projects-2019/drivers/geckodriver-v0.23.exe"));
		 FirefoxDriver driver = new FirefoxDriver();
		 */
		 driver.get("https://foreverspin.com/");
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.className("btn-store")).click();
		 System.out.println("The page title is: " + driver.getTitle());
		 
		 Thread.sleep(2000);
		 	
		 WebElement total_price = driver.findElement(By.className("total-price"));
		 
		 String actual_price = total_price.getText();
	
		 System.out.println("The total right now is: " + actual_price); /*.getText is used for getting the value displayed in an element*/
		 
		 String expected_price = "$0";
		 if (actual_price.equals(expected_price))
			 System.out.println("There are no items selected");
		 else
			 System.out.println("An item was picked for checkout");
		 
		 driver.quit();
	}
}


