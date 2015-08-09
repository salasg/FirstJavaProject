package tep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Open the FF Browser");
		WebDriver driver = new FirefoxDriver ();
		
		//make the window maximize
		driver.manage().window().maximize();
		
		//opens website
		driver.get("http://tepeople.com/");
		
		System.out.println("Please wait for 3 secs");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Contact Us")).click();
		System.out.println("Close the FF Browser");
		System.out.println("Test passed");
		driver.quit();
		
		
	}

}
