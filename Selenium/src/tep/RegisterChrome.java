package tep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		
		
//WebDriver driver = new FirefoxDriver();
//C:\\Program Files (x86)\\Selenium\\Selenium\\chromedriver.exe <----goes to Property, Chrome File
		//webdriver.chrome.driver <---- goes to Property, gets Chrome
		
		
driver.manage().window().maximize();
driver.get("http://webloadmpstore.com");
Thread.sleep(2000);

driver.findElement(By.linkText("LOGIN")).click();
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.name("name")).clear();
driver.findElement(By.name("name")).sendKeys("Gio");
Thread.sleep(2000);

driver.findElement(By.name("email")).clear();
driver.findElement(By.name("email")).sendKeys("gio@aol.com");

driver.findElement(By.name("phone")).clear();
driver.findElement(By.name("phone")).sendKeys("973123456");

driver.findElement(By.name("login")).clear();
driver.findElement(By.name("login")).sendKeys("gio11");

driver.findElement(By.name("password")).clear();
driver.findElement(By.name("password")).sendKeys("tep8910");

driver.findElement(By.name("password2")).clear();
driver.findElement(By.name("password2")).sendKeys("tep8910");

driver.findElement(By.name("Submit")).click();

System.out.println("HELLO TEST");


driver.quit();




}

}