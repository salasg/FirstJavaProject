package tep;

//package com.example.tests;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class contact {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://tepeople.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTepeopleContact() throws Exception {
    driver.get("http://tepeople.com/");
    driver.findElement(By.xpath("//a[contains(text(),'Contact US')]")).click();
    driver.findElement(By.cssSelector("input[name=\"firstname\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("Gio");
    driver.findElement(By.cssSelector("input[name=\"lastname\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("Test");
    driver.findElement(By.xpath("//input[@name='phone_no']")).clear();
    driver.findElement(By.xpath("//input[@name='phone_no']")).sendKeys("9735671234");
    driver.findElement(By.xpath("//input[@name='email']")).clear();
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gio234@aol.com");
    driver.findElement(By.xpath("//form[@id='form_style']/input[5]")).clear();
    driver.findElement(By.xpath("//form[@id='form_style']/input[5]")).sendKeys("Selenium");
    driver.findElement(By.xpath("//form[@id='form_style']/textarea")).clear();
    driver.findElement(By.xpath("//form[@id='form_style']/textarea")).sendKeys("I'm Interested in Selenium");
    driver.findElement(By.cssSelector("div.btn > input[type=\"submit\"]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
