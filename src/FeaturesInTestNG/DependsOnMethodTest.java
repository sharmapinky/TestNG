package FeaturesInTestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethodTest {
	WebDriver driver;
  @BeforeMethod
  public void setup(){
	  System.setProperty("webdriver.gecko.driver", "G:\\webdrivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	  
  }
  @Test
  public void login(){
	  driver.findElement(By.name("email")).sendKeys("pinkysharma.3103@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("dayaraj28");
	  driver.findElement(By.id("loginbutton")).click();
	String title=driver.getTitle();
	Assert.assertEquals(title,"Facebook", "wrongtitle");
  }
  @Test
  public void homepage(){
	  driver.findElement(By.id("userNavigationLabel")).click();
	  
  }
}
