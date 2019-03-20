package ParametersinTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Passingparametrs {
	WebDriver driver;
@BeforeMethod
public void setup(){
	System.setProperty("webdriver.gecko.driver", "G:\\webdrivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://crmpro.com/index.html");
	
}
@Test
@Parameters({ "user", "pass" })
public void login(String user,String pass){
	driver.findElement(By.name("username")).sendKeys(user);
	driver.findElement(By.name("password")).sendKeys(pass);
}
}
